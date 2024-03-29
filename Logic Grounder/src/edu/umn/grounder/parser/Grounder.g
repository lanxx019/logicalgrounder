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
   private Clause currentClause = null;
   
   public void setLogicContext(LogicContext language) {
    this.language = language;
   }
   
   public LogicContext getLogicContext() {
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
  : sort[$value] (',' sort[$value])*;
  
sort[List<String> param] returns [String value]
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
  : sort[null]
  { 
    Sort sort = null;
    if (language.hasRecorded($sort.value)) {
      sort = new Sort($sort.value);
      language.addSort(sort); 
    } else {
      String msg = "Sort %s has not been defined in the sort section!";
      this.printErrorMessage(String.format(msg, $sort.value));
    }
  } ':' objects[sort]
  | sort[null] ':' min '...' max 
  {
    if (language.hasRecorded($sort.value)) { 
      NumericalSort sort = new NumericalSort($sort.value, $min.value, $max.value);
      language.addSort(sort); 
    } else {
      String msg = "Sort %s has not been defined in the sort section!";
      this.printErrorMessage(String.format(msg, $sort.value));
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
  : object[$param] (',' object[$param])*;
  
object[Sort param]
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
  : sort[null]
  {
    AbstractSort sort = language.getSort($sort.value);
  } ':' variables[sort];
  
variables[AbstractSort param]
  : variable[$param] (',' variable[$param])*;

variable[AbstractSort param] 
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
  : sort[null] 
  {
    AbstractSort sort = language.getSort($sort.value);
  } ':' constants[sort];
  
constants[AbstractSort param]
  : constant[$param] (',' constant[$param])*;
  
constant[AbstractSort param]
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
  : clauses '.' globalConstraints;
// $>

// $<clauses
clauses
  : clause (';' clause)*;

clause
  : 
  {
    Clause clause = new Clause();
    language.getTheory().addClause(clause);
  }
  literals[clause] (':' constraints[clause])*;

literals[Clause param]
  : literal[$param] (',' literal[$param])*;

literal[Clause param]
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
  } ('(' arguments[(AbstractFunctionInstance)$value] ')')*;

rhs returns [Instance value]
  : NAME
  {
    if (language.hasVariable($NAME.text)) {
      $value = language.getVariable($NAME.text);
      language.getTheory().getCurrentClause().addVariable((Variable)$value);
    } else if (language.hasObjectTermCollection($NAME.text)) {
      $value = new ObjectFunctionInstance(
      language.getObjectTermCollection($NAME.text));
    }
  } ('(' arguments[(AbstractFunctionInstance)$value] ')')*;
  
arguments[AbstractFunctionInstance param]
  : argument[$param] (',' argument[$param])*;
  
argument[AbstractFunctionInstance param]
  : NAME
  {
    Instance instance = null;
    if (language.hasVariable($NAME.text)) {
      instance = language.getVariable($NAME.text);
      language.getTheory().getCurrentClause().addVariable((Variable)instance);
    } else if (language.hasObjectTermCollection($NAME.text)) {
      instance = new ObjectFunctionInstance(
      language.getObjectTermCollection($NAME.text));
    }
    $param.addArgument(instance);
  } ('(' arguments[(AbstractFunctionInstance)instance] ')')*;
// $>

// $<constraints
globalConstraints
  : constraints[null];

constraints[Clause param]
  : constraint[$param] (',' constraint[$param])*;

constraint[Clause param]
  : left '==' right
  {
    Constraint constraint = new Equal($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
  }
  | left '!=' right
  {
    Constraint constraint = new NotEqual($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
  }
  | left '>' right
  {
    Constraint constraint = new Greater($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
  }
  | left '>=' right
  {
    Constraint constraint = new GreaterOrEqual($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
  }
  | left '<' right
  {
    Constraint constraint = new Less($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
  }
  | left '<=' right
  {
    Constraint constraint = new LessOrEqual($left.value, $right.value);
    if ($param != null) {
      $param.addConstraint(constraint);
    } else {
      language.getTheory().addGlobalConstraint(constraint);
    }
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
