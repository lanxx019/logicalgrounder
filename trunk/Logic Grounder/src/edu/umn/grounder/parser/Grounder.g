grammar Grounder;

options {
  language = Java;
}

@header {
  package edu.umn.grounder.parser;
  
  import edu.umn.grounder.*;
  import edu.umn.grounder.constraint.*;
  import edu.umn.grounder.core.*;
  import edu.umn.grounder.expression.*;
  import edu.umn.grounder.instance.*;
  import edu.umn.grounder.constraint.Comparable;
}

@members { 
   private LogicContext language = new LogicContext(); 
   
   public void setLanguage(LogicContext language) {
    this.language = language;
   }
   
   public LogicContext getLanguage() {
    return this.language;
   }
   
   public void printErrorMessage(String message) {
    System.out.println(message);
    System.exit(1);
   }
}

@lexer::header {
  package edu.umn.grounder.parser;
}

// $<Language_Definition
language
  : sortSection objectSection variableSection constantSection theory; 
// $>

// $<Sort_Definition
sortSection
  : SORTS ':' sorts '.';
  
sorts returns [List<String> value = new ArrayList<String>()]
  : aSort[$value] (',' aSort[$value])*;
  
aSort[List<String> param] returns [String value]
  : NAME 
  {
    $value = $NAME.text;
    if ($param != null) {
      language.recordSortName($value); 
      param.add($value);
    }
  }; 
// $>

// $<Object_Definition
objectSection
  : OBJECTS ':' objectSortSections '.';

objectSortSections
  : objectsInOneSort (';' objectsInOneSort)*;
  
objectsInOneSort
  : aSort[null]
  { 
    Sort sort = null;
    if (language.hasRecorded($aSort.value)) {
      sort = new Sort($aSort.value);
      language.addSort(sort); 
    } else {
      String msg = "Sort %s has not been defined in the sort section!";
      this.printErrorMessage(String.format(msg, $aSort.value));
    }
  } ':' objects[sort]
  | aSort[null] ':' min '...' max 
  {
    if (language.hasRecorded($aSort.value)) { 
      NumericalSort sort = new NumericalSort($aSort.value, $min.value, $max.value);
      language.addSort(sort); 
    } else {
      String msg = "Sort %s has not been defined in the sort section!";
      this.printErrorMessage(String.format(msg, $aSort.value));
    }
  };

min returns [int value]
  : NUMBER
  { 
    $value = Integer.parseInt($NUMBER.text); 
  };
  
max returns [int value]
  : NUMBER 
  { 
    $value = Integer.parseInt($NUMBER.text);
  };

objects[Sort param]
  : aObject[$param] (',' aObject[$param])*;
  
aObject[Sort param]
  : NAME ('(' sorts ')')*
  {
    ObjectFunction function = new ObjectFunction($NAME.text);
    if ($sorts.value != null) {
      for (String sortName : $sorts.value) {
        function.recordArgumentName(sortName);
      }
    }
    language.addObjectTermCollection(function);
    $param.addObjectTermCollection(function);
  };  
// $>

// $<Variable_Definition
variableSection
  : VARIABLES ':' variableSortSections '.';
  
variableSortSections
  : variablesInOneSort (';' variablesInOneSort)*;

variablesInOneSort
  : aSort[null]
  {
    AbstractSort sort = language.getSort($aSort.value);
  } ':' variables[sort];
  
variables[AbstractSort param]
  : aVariable[$param] (',' aVariable[$param])*;

aVariable[AbstractSort param] 
  : NAME 
  { 
    Variable var = null;
    var = new Variable($NAME.text);
    language.addVariable(var);
    var.setSortType($param);
  }; 
// $>

// $<constant_Definition
constantSection
  : CONSTANTS ':' constantSortSections '.';
  
constantSortSections
  : constantsInOneSort (';' constantsInOneSort)*;
  
constantsInOneSort
  : aSort[null] 
  {
    AbstractSort sort = language.getSort($aSort.value);
  } ':' constants[sort];
  
constants[AbstractSort param]
  : aConstant[$param] (',' aConstant[$param])*;
  
aConstant[AbstractSort param]
  : NAME ('(' sorts ')')*
  {
    ConstantFunction function = new ConstantFunction($NAME.text);
    function.setSortType(param);
    language.addConstantTermCollection(function);
    
    if ($sorts.value != null) {
      for (String sortName : $sorts.value) {
        function.addArgument(language.getSort(sortName));
      }
    }
  };
// $>

// $<theory
theory
  : clauses '.' (constraints)*;
// $>

// $<clauses
clauses
  : aClause (';' aClause)*;

aClause
  : {Clause clause = new Clause();}
  aLiteral[clause] (',' aLiteral[clause])*
  {
    language.getTheory().addClause(clause);
  };

aLiteral[Clause param]
  : lhs sign rhs
  {
    $param.addLiteral(new Literal($lhs.value, $rhs.value, $sign.value));
  };
  
sign returns [boolean value]
  : '='
  {
    $value = true;
  }
  | '!='
  {
    $value = false;
  };

lhs returns [ConstantFunctionInstance value]
  : NAME
  {
    $value = new ConstantFunctionInstance(
      language.getConstantTermCollection($NAME.text));
  } ('(' argumentList[(AbstractFunctionInstance)$value] ')')*;

rhs returns [Instance value]
  : NAME
  {
    if (language.hasVariable($NAME.text)) {
      $value = language.getVariable($NAME.text);
      language.getTheory().addVariable((Variable)$value);
    } else if (language.hasObjectTermCollection($NAME.text)) {
      $value = new ObjectFunctionInstance(
        language.getObjectTermCollection($NAME.text));
    }
  } ('(' argumentList[(AbstractFunctionInstance)$value] ')')*;
  
argumentList[AbstractFunctionInstance param]
  : aArgument[$param] (',' aArgument[$param])*;
  
aArgument[AbstractFunctionInstance param]
  : NAME
  {
    Instance instance = null;
    if (language.hasVariable($NAME.text)) {
      instance = language.getVariable($NAME.text);
      language.getTheory().addVariable((Variable)instance);
    } else if (language.hasObjectTermCollection($NAME.text)) {
      instance = new ObjectFunctionInstance(
            language.getObjectTermCollection($NAME.text));
    }
    $param.addArgument(instance);
  } ('(' argumentList[(AbstractFunctionInstance)instance] ')')*;
// $>

// $<constraints
constraints
  : aConstraint (',' aConstraint)*;

aConstraint
  : left '==' right
  {
    Constraint constraint = new Equal($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  }
  | left '!=' right
  {
    Constraint constraint = new NotEqual($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  }
  | left '>' right
  {
    Constraint constraint = new Greater($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  }
  | left '>=' right
  {
    Constraint constraint = new GreaterOrEqual($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  }
  | left '<' right
  {
    Constraint constraint = new Less($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  }
  | left '<=' right
  {
    Constraint constraint = new LessOrEqual($left.value, $right.value);
    language.getTheory().addConstraint(constraint);
  };
  
left returns [Comparable value]
  : op
  {
    $value = $op.value;
  };
  
right returns [Comparable value]
  : op
  {
    $value = $op.value;
  };
  
op returns [Comparable value]
  : NAME
  {
    $value = language.getVariable($NAME.text);
  }
  | NUMBER
  {
    $value = new IntegerComparable($NUMBER.text);
  };
// $>

// $<FRAGMENTS
fragment LETTER : LOWER | UPPER;
fragment LOWER  : 'a'..'z';
fragment UPPER  : 'A'..'Z';
fragment DIGIT  : '0'..'9';     
// $>

// $<SECTION_TOKENS
SORTS     : ('s' | 'S')'ort'('s')?;
OBJECTS   : ('o' | 'O')'bject'('s')?;
VARIABLES : ('v' | 'V')'ariable'('s')?;
CONSTANTS : ('c' | 'C')'onstant'('s')?;
// $>

// $<GENERAL_TOKENS 
NAME    : LETTER (LETTER | DIGIT | '_')*;
NUMBER  : '1'..'9'(DIGIT)*;
SPACE   : (' ' | '\t')+ {$channel=HIDDEN;};
NEWLINE :  '\r'?'\n' {$channel=HIDDEN;};
// $>
