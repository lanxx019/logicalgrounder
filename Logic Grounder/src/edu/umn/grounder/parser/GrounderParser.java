// $ANTLR 3.1.2 /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g 2009-04-02 14:56:22

  package edu.umn.grounder.parser;
  
  import edu.umn.grounder.*;
  import edu.umn.grounder.constraint.*;
  import edu.umn.grounder.core.*;
  import edu.umn.grounder.expression.*;
  import edu.umn.grounder.instance.*;
  import edu.umn.grounder.constraint.Comparable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrounderParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SORTS", "NAME", "OBJECTS", "NUMBER", "VARIABLES", "CONSTANTS", "LOWER", "UPPER", "LETTER", "DIGIT", "SPACE", "NEWLINE", "':'", "'.'", "','", "';'", "'...'", "'('", "')'", "'='", "'!='", "'=='", "'>'", "'>='", "'<'", "'<='"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int LETTER=12;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int NUMBER=7;
    public static final int CONSTANTS=9;
    public static final int SPACE=14;
    public static final int EOF=-1;
    public static final int SORTS=4;
    public static final int T__19=19;
    public static final int NAME=5;
    public static final int T__16=16;
    public static final int NEWLINE=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int OBJECTS=6;
    public static final int VARIABLES=8;
    public static final int DIGIT=13;
    public static final int LOWER=10;
    public static final int UPPER=11;

    // delegates
    // delegators


        public GrounderParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GrounderParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GrounderParser.tokenNames; }
    public String getGrammarFileName() { return "/home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g"; }

     
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



    // $ANTLR start "language"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:41:1: language : sortSection objectSection variableSection constantSection theory ;
    public final void language() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:42:3: ( sortSection objectSection variableSection constantSection theory )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:42:5: sortSection objectSection variableSection constantSection theory
            {
            pushFollow(FOLLOW_sortSection_in_language48);
            sortSection();

            state._fsp--;

            pushFollow(FOLLOW_objectSection_in_language50);
            objectSection();

            state._fsp--;

            pushFollow(FOLLOW_variableSection_in_language52);
            variableSection();

            state._fsp--;

            pushFollow(FOLLOW_constantSection_in_language54);
            constantSection();

            state._fsp--;

            pushFollow(FOLLOW_theory_in_language56);
            theory();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "language"


    // $ANTLR start "sortSection"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:46:1: sortSection : SORTS ':' sorts '.' ;
    public final void sortSection() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:47:3: ( SORTS ':' sorts '.' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:47:5: SORTS ':' sorts '.'
            {
            match(input,SORTS,FOLLOW_SORTS_in_sortSection69); 
            match(input,16,FOLLOW_16_in_sortSection71); 
            pushFollow(FOLLOW_sorts_in_sortSection73);
            sorts();

            state._fsp--;

            match(input,17,FOLLOW_17_in_sortSection75); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sortSection"


    // $ANTLR start "sorts"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:49:1: sorts returns [List<String> value = new ArrayList<String>()] : sort[$value] ( ',' sort[$value] )* ;
    public final List<String> sorts() throws RecognitionException {
        List<String> value =  new ArrayList<String>();

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:50:3: ( sort[$value] ( ',' sort[$value] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:50:5: sort[$value] ( ',' sort[$value] )*
            {
            pushFollow(FOLLOW_sort_in_sorts91);
            sort(value);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:50:18: ( ',' sort[$value] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:50:19: ',' sort[$value]
            	    {
            	    match(input,18,FOLLOW_18_in_sorts95); 
            	    pushFollow(FOLLOW_sort_in_sorts97);
            	    sort(value);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sorts"


    // $ANTLR start "sort"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:52:1: sort[List<String> param] returns [String value] : NAME ;
    public final String sort(List<String> param) throws RecognitionException {
        String value = null;

        Token NAME1=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:53:3: ( NAME )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:53:5: NAME
            {
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_sort117); 

                value = (NAME1!=null?NAME1.getText():null);
                if (param != null) {
                  language.recordSortName(value); 
                  param.add(value);
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sort"


    // $ANTLR start "objectSection"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:64:1: objectSection : OBJECTS ':' objectSortSections '.' ;
    public final void objectSection() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:65:3: ( OBJECTS ':' objectSortSections '.' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:65:5: OBJECTS ':' objectSortSections '.'
            {
            match(input,OBJECTS,FOLLOW_OBJECTS_in_objectSection135); 
            match(input,16,FOLLOW_16_in_objectSection137); 
            pushFollow(FOLLOW_objectSortSections_in_objectSection139);
            objectSortSections();

            state._fsp--;

            match(input,17,FOLLOW_17_in_objectSection141); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "objectSection"


    // $ANTLR start "objectSortSections"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:67:1: objectSortSections : objectsInOneSort ( ';' objectsInOneSort )* ;
    public final void objectSortSections() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:68:3: ( objectsInOneSort ( ';' objectsInOneSort )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:68:5: objectsInOneSort ( ';' objectsInOneSort )*
            {
            pushFollow(FOLLOW_objectsInOneSort_in_objectSortSections151);
            objectsInOneSort();

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:68:22: ( ';' objectsInOneSort )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:68:23: ';' objectsInOneSort
            	    {
            	    match(input,19,FOLLOW_19_in_objectSortSections154); 
            	    pushFollow(FOLLOW_objectsInOneSort_in_objectSortSections156);
            	    objectsInOneSort();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "objectSortSections"


    // $ANTLR start "objectsInOneSort"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:70:1: objectsInOneSort : ( sort[null] ':' objects[sort] | sort[null] ':' min '...' max );
    public final void objectsInOneSort() throws RecognitionException {
        String sort2 = null;

        String sort3 = null;

        int min4 = 0;

        int max5 = 0;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:71:3: ( sort[null] ':' objects[sort] | sort[null] ':' min '...' max )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NAME) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==NAME) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==NUMBER) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:71:5: sort[null] ':' objects[sort]
                    {
                    pushFollow(FOLLOW_sort_in_objectsInOneSort170);
                    sort2=sort(null);

                    state._fsp--;

                     
                        Sort sort = null;
                        if (language.hasRecorded(sort2)) {
                          sort = new Sort(sort2);
                          language.addSort(sort); 
                        } else {
                          String msg = "Sort %s has not been defined in the sort section!";
                          this.printErrorMessage(String.format(msg, sort2));
                        }
                      
                    match(input,16,FOLLOW_16_in_objectsInOneSort177); 
                    pushFollow(FOLLOW_objects_in_objectsInOneSort179);
                    objects(sort);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:82:5: sort[null] ':' min '...' max
                    {
                    pushFollow(FOLLOW_sort_in_objectsInOneSort186);
                    sort3=sort(null);

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_objectsInOneSort189); 
                    pushFollow(FOLLOW_min_in_objectsInOneSort191);
                    min4=min();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_objectsInOneSort193); 
                    pushFollow(FOLLOW_max_in_objectsInOneSort195);
                    max5=max();

                    state._fsp--;


                        if (language.hasRecorded(sort3)) { 
                          NumericalSort sort = new NumericalSort(sort3, min4, max5);
                          language.addSort(sort); 
                        } else {
                          String msg = "Sort %s has not been defined in the sort section!";
                          this.printErrorMessage(String.format(msg, sort3));
                        }
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "objectsInOneSort"


    // $ANTLR start "min"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:93:1: min returns [int value] : NUMBER ;
    public final int min() throws RecognitionException {
        int value = 0;

        Token NUMBER6=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:94:3: ( NUMBER )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:94:5: NUMBER
            {
            NUMBER6=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_min214); 
             
                value = Integer.parseInt((NUMBER6!=null?NUMBER6.getText():null)); 
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "min"


    // $ANTLR start "max"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:99:1: max returns [int value] : NUMBER ;
    public final int max() throws RecognitionException {
        int value = 0;

        Token NUMBER7=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:100:3: ( NUMBER )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:100:5: NUMBER
            {
            NUMBER7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_max234); 
             
                value = Integer.parseInt((NUMBER7!=null?NUMBER7.getText():null));
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "max"


    // $ANTLR start "objects"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:105:1: objects[Sort param] : object[$param] ( ',' object[$param] )* ;
    public final void objects(Sort param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:106:3: ( object[$param] ( ',' object[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:106:5: object[$param] ( ',' object[$param] )*
            {
            pushFollow(FOLLOW_object_in_objects250);
            object(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:106:20: ( ',' object[$param] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:106:21: ',' object[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_objects254); 
            	    pushFollow(FOLLOW_object_in_objects256);
            	    object(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "objects"


    // $ANTLR start "object"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:108:1: object[Sort param] : NAME ( '(' sorts ')' )* ;
    public final void object(Sort param) throws RecognitionException {
        Token NAME8=null;
        List<String> sorts9 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:109:3: ( NAME ( '(' sorts ')' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:109:5: NAME ( '(' sorts ')' )*
            {
            NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_object272); 
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:109:10: ( '(' sorts ')' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:109:11: '(' sorts ')'
            	    {
            	    match(input,21,FOLLOW_21_in_object275); 
            	    pushFollow(FOLLOW_sorts_in_object277);
            	    sorts9=sorts();

            	    state._fsp--;

            	    match(input,22,FOLLOW_22_in_object279); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


                ObjectFunction function = new ObjectFunction((NAME8!=null?NAME8.getText():null));
                if (sorts9 != null) {
                  for (String sortName : sorts9) {
                    function.recordArgumentName(sortName);
                  }
                }
                language.addObjectTermCollection(function);
                param.addObjectTermCollection(function);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "object"


    // $ANTLR start "variableSection"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:123:1: variableSection : VARIABLES ':' variableSortSections '.' ;
    public final void variableSection() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:124:3: ( VARIABLES ':' variableSortSections '.' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:124:5: VARIABLES ':' variableSortSections '.'
            {
            match(input,VARIABLES,FOLLOW_VARIABLES_in_variableSection299); 
            match(input,16,FOLLOW_16_in_variableSection301); 
            pushFollow(FOLLOW_variableSortSections_in_variableSection303);
            variableSortSections();

            state._fsp--;

            match(input,17,FOLLOW_17_in_variableSection305); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableSection"


    // $ANTLR start "variableSortSections"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:126:1: variableSortSections : variablesInOneSort ( ';' variablesInOneSort )* ;
    public final void variableSortSections() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:127:3: ( variablesInOneSort ( ';' variablesInOneSort )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:127:5: variablesInOneSort ( ';' variablesInOneSort )*
            {
            pushFollow(FOLLOW_variablesInOneSort_in_variableSortSections317);
            variablesInOneSort();

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:127:24: ( ';' variablesInOneSort )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:127:25: ';' variablesInOneSort
            	    {
            	    match(input,19,FOLLOW_19_in_variableSortSections320); 
            	    pushFollow(FOLLOW_variablesInOneSort_in_variableSortSections322);
            	    variablesInOneSort();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableSortSections"


    // $ANTLR start "variablesInOneSort"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:129:1: variablesInOneSort : sort[null] ':' variables[sort] ;
    public final void variablesInOneSort() throws RecognitionException {
        String sort10 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:130:3: ( sort[null] ':' variables[sort] )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:130:5: sort[null] ':' variables[sort]
            {
            pushFollow(FOLLOW_sort_in_variablesInOneSort334);
            sort10=sort(null);

            state._fsp--;


                AbstractSort sort = language.getSort(sort10);
              
            match(input,16,FOLLOW_16_in_variablesInOneSort341); 
            pushFollow(FOLLOW_variables_in_variablesInOneSort343);
            variables(sort);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variablesInOneSort"


    // $ANTLR start "variables"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:135:1: variables[AbstractSort param] : variable[$param] ( ',' variable[$param] )* ;
    public final void variables(AbstractSort param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:136:3: ( variable[$param] ( ',' variable[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:136:5: variable[$param] ( ',' variable[$param] )*
            {
            pushFollow(FOLLOW_variable_in_variables357);
            variable(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:136:22: ( ',' variable[$param] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:136:23: ',' variable[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_variables361); 
            	    pushFollow(FOLLOW_variable_in_variables363);
            	    variable(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variables"


    // $ANTLR start "variable"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:138:1: variable[AbstractSort param] : NAME ;
    public final void variable(AbstractSort param) throws RecognitionException {
        Token NAME11=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:139:3: ( NAME )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:139:5: NAME
            {
            NAME11=(Token)match(input,NAME,FOLLOW_NAME_in_variable378); 
             
                Variable var = null;
                var = new Variable((NAME11!=null?NAME11.getText():null));
                language.addVariable(var);
                var.setSortType(param);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"


    // $ANTLR start "constantSection"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:149:1: constantSection : CONSTANTS ':' constantSortSections '.' ;
    public final void constantSection() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:150:3: ( CONSTANTS ':' constantSortSections '.' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:150:5: CONSTANTS ':' constantSortSections '.'
            {
            match(input,CONSTANTS,FOLLOW_CONSTANTS_in_constantSection396); 
            match(input,16,FOLLOW_16_in_constantSection398); 
            pushFollow(FOLLOW_constantSortSections_in_constantSection400);
            constantSortSections();

            state._fsp--;

            match(input,17,FOLLOW_17_in_constantSection402); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantSection"


    // $ANTLR start "constantSortSections"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:152:1: constantSortSections : constantsInOneSort ( ';' constantsInOneSort )* ;
    public final void constantSortSections() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:153:3: ( constantsInOneSort ( ';' constantsInOneSort )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:153:5: constantsInOneSort ( ';' constantsInOneSort )*
            {
            pushFollow(FOLLOW_constantsInOneSort_in_constantSortSections414);
            constantsInOneSort();

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:153:24: ( ';' constantsInOneSort )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:153:25: ';' constantsInOneSort
            	    {
            	    match(input,19,FOLLOW_19_in_constantSortSections417); 
            	    pushFollow(FOLLOW_constantsInOneSort_in_constantSortSections419);
            	    constantsInOneSort();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantSortSections"


    // $ANTLR start "constantsInOneSort"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:155:1: constantsInOneSort : sort[null] ':' constants[sort] ;
    public final void constantsInOneSort() throws RecognitionException {
        String sort12 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:156:3: ( sort[null] ':' constants[sort] )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:156:5: sort[null] ':' constants[sort]
            {
            pushFollow(FOLLOW_sort_in_constantsInOneSort433);
            sort12=sort(null);

            state._fsp--;


                AbstractSort sort = language.getSort(sort12);
              
            match(input,16,FOLLOW_16_in_constantsInOneSort441); 
            pushFollow(FOLLOW_constants_in_constantsInOneSort443);
            constants(sort);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantsInOneSort"


    // $ANTLR start "constants"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:161:1: constants[AbstractSort param] : constant[$param] ( ',' constant[$param] )* ;
    public final void constants(AbstractSort param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:162:3: ( constant[$param] ( ',' constant[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:162:5: constant[$param] ( ',' constant[$param] )*
            {
            pushFollow(FOLLOW_constant_in_constants457);
            constant(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:162:22: ( ',' constant[$param] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:162:23: ',' constant[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_constants461); 
            	    pushFollow(FOLLOW_constant_in_constants463);
            	    constant(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constants"


    // $ANTLR start "constant"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:164:1: constant[AbstractSort param] : NAME ( '(' sorts ')' )* ;
    public final void constant(AbstractSort param) throws RecognitionException {
        Token NAME13=null;
        List<String> sorts14 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:165:3: ( NAME ( '(' sorts ')' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:165:5: NAME ( '(' sorts ')' )*
            {
            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_constant479); 
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:165:10: ( '(' sorts ')' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:165:11: '(' sorts ')'
            	    {
            	    match(input,21,FOLLOW_21_in_constant482); 
            	    pushFollow(FOLLOW_sorts_in_constant484);
            	    sorts14=sorts();

            	    state._fsp--;

            	    match(input,22,FOLLOW_22_in_constant486); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


                ConstantFunction function = new ConstantFunction((NAME13!=null?NAME13.getText():null));
                function.setSortType(param);
                language.addConstantTermCollection(function);
                
                if (sorts14 != null) {
                  for (String sortName : sorts14) {
                    function.addArgument(language.getSort(sortName));
                  }
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant"


    // $ANTLR start "theory"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:180:1: theory : clauses '.' globalConstraints ;
    public final void theory() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:181:3: ( clauses '.' globalConstraints )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:181:5: clauses '.' globalConstraints
            {
            pushFollow(FOLLOW_clauses_in_theory504);
            clauses();

            state._fsp--;

            match(input,17,FOLLOW_17_in_theory506); 
            pushFollow(FOLLOW_globalConstraints_in_theory508);
            globalConstraints();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "theory"


    // $ANTLR start "clauses"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:185:1: clauses : clause ( ';' clause )* ;
    public final void clauses() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:186:3: ( clause ( ';' clause )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:186:5: clause ( ';' clause )*
            {
            pushFollow(FOLLOW_clause_in_clauses520);
            clause();

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:186:12: ( ';' clause )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:186:13: ';' clause
            	    {
            	    match(input,19,FOLLOW_19_in_clauses523); 
            	    pushFollow(FOLLOW_clause_in_clauses525);
            	    clause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "clauses"


    // $ANTLR start "clause"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:188:1: clause : literals[clause] ( ':' constraints[clause] )* ;
    public final void clause() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:189:3: ( literals[clause] ( ':' constraints[clause] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:190:3: literals[clause] ( ':' constraints[clause] )*
            {

                Clause clause = new Clause();
                language.getTheory().addClause(clause);
              
            pushFollow(FOLLOW_literals_in_clause544);
            literals(clause);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:194:20: ( ':' constraints[clause] )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:194:21: ':' constraints[clause]
            	    {
            	    match(input,16,FOLLOW_16_in_clause548); 
            	    pushFollow(FOLLOW_constraints_in_clause550);
            	    constraints(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "clause"


    // $ANTLR start "literals"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:196:1: literals[Clause param] : literal[$param] ( ',' literal[$param] )* ;
    public final void literals(Clause param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:197:3: ( literal[$param] ( ',' literal[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:197:5: literal[$param] ( ',' literal[$param] )*
            {
            pushFollow(FOLLOW_literal_in_literals564);
            literal(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:197:21: ( ',' literal[$param] )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:197:22: ',' literal[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_literals568); 
            	    pushFollow(FOLLOW_literal_in_literals570);
            	    literal(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literals"


    // $ANTLR start "literal"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:199:1: literal[Clause param] : lhs sign rhs ;
    public final void literal(Clause param) throws RecognitionException {
        ConstantFunctionInstance lhs15 = null;

        Instance rhs16 = null;

        boolean sign17 = false;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:200:3: ( lhs sign rhs )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:200:5: lhs sign rhs
            {
            pushFollow(FOLLOW_lhs_in_literal584);
            lhs15=lhs();

            state._fsp--;

            pushFollow(FOLLOW_sign_in_literal586);
            sign17=sign();

            state._fsp--;

            pushFollow(FOLLOW_rhs_in_literal588);
            rhs16=rhs();

            state._fsp--;


                param.addLiteral(new Literal(lhs15, rhs16, sign17));
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "sign"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:205:1: sign returns [boolean value] : ( '=' | '!=' );
    public final boolean sign() throws RecognitionException {
        boolean value = false;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:206:3: ( '=' | '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:206:5: '='
                    {
                    match(input,23,FOLLOW_23_in_sign608); 

                        value = true;
                      

                    }
                    break;
                case 2 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:210:5: '!='
                    {
                    match(input,24,FOLLOW_24_in_sign618); 

                        value = false;
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "sign"


    // $ANTLR start "lhs"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:215:1: lhs returns [ConstantFunctionInstance value] : NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )* ;
    public final ConstantFunctionInstance lhs() throws RecognitionException {
        ConstantFunctionInstance value = null;

        Token NAME18=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:216:3: ( NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:216:5: NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )*
            {
            NAME18=(Token)match(input,NAME,FOLLOW_NAME_in_lhs636); 

                value = new ConstantFunctionInstance(
                  language.getConstantTermCollection((NAME18!=null?NAME18.getText():null)));
              
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:220:5: ( '(' arguments[(AbstractFunctionInstance)$value] ')' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:220:6: '(' arguments[(AbstractFunctionInstance)$value] ')'
            	    {
            	    match(input,21,FOLLOW_21_in_lhs643); 
            	    pushFollow(FOLLOW_arguments_in_lhs645);
            	    arguments((AbstractFunctionInstance)value);

            	    state._fsp--;

            	    match(input,22,FOLLOW_22_in_lhs648); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "lhs"


    // $ANTLR start "rhs"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:222:1: rhs returns [Instance value] : NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )* ;
    public final Instance rhs() throws RecognitionException {
        Instance value = null;

        Token NAME19=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:223:3: ( NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:223:5: NAME ( '(' arguments[(AbstractFunctionInstance)$value] ')' )*
            {
            NAME19=(Token)match(input,NAME,FOLLOW_NAME_in_rhs664); 

                if (language.hasVariable((NAME19!=null?NAME19.getText():null))) {
                  value = language.getVariable((NAME19!=null?NAME19.getText():null));
                  language.getTheory().getCurrentClause().addVariable((Variable)value);
                } else if (language.hasObjectTermCollection((NAME19!=null?NAME19.getText():null))) {
                  value = new ObjectFunctionInstance(
                  language.getObjectTermCollection((NAME19!=null?NAME19.getText():null)));
                }
              
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:232:5: ( '(' arguments[(AbstractFunctionInstance)$value] ')' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:232:6: '(' arguments[(AbstractFunctionInstance)$value] ')'
            	    {
            	    match(input,21,FOLLOW_21_in_rhs671); 
            	    pushFollow(FOLLOW_arguments_in_rhs673);
            	    arguments((AbstractFunctionInstance)value);

            	    state._fsp--;

            	    match(input,22,FOLLOW_22_in_rhs676); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "rhs"


    // $ANTLR start "arguments"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:234:1: arguments[AbstractFunctionInstance param] : argument[$param] ( ',' argument[$param] )* ;
    public final void arguments(AbstractFunctionInstance param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:235:3: ( argument[$param] ( ',' argument[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:235:5: argument[$param] ( ',' argument[$param] )*
            {
            pushFollow(FOLLOW_argument_in_arguments691);
            argument(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:235:22: ( ',' argument[$param] )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:235:23: ',' argument[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_arguments695); 
            	    pushFollow(FOLLOW_argument_in_arguments697);
            	    argument(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "argument"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:237:1: argument[AbstractFunctionInstance param] : NAME ( '(' arguments[(AbstractFunctionInstance)instance] ')' )* ;
    public final void argument(AbstractFunctionInstance param) throws RecognitionException {
        Token NAME20=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:238:3: ( NAME ( '(' arguments[(AbstractFunctionInstance)instance] ')' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:238:5: NAME ( '(' arguments[(AbstractFunctionInstance)instance] ')' )*
            {
            NAME20=(Token)match(input,NAME,FOLLOW_NAME_in_argument713); 

                Instance instance = null;
                if (language.hasVariable((NAME20!=null?NAME20.getText():null))) {
                  instance = language.getVariable((NAME20!=null?NAME20.getText():null));
                  language.getTheory().getCurrentClause().addVariable((Variable)instance);
                } else if (language.hasObjectTermCollection((NAME20!=null?NAME20.getText():null))) {
                  instance = new ObjectFunctionInstance(
                  language.getObjectTermCollection((NAME20!=null?NAME20.getText():null)));
                }
                param.addArgument(instance);
              
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:249:5: ( '(' arguments[(AbstractFunctionInstance)instance] ')' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:249:6: '(' arguments[(AbstractFunctionInstance)instance] ')'
            	    {
            	    match(input,21,FOLLOW_21_in_argument720); 
            	    pushFollow(FOLLOW_arguments_in_argument722);
            	    arguments((AbstractFunctionInstance)instance);

            	    state._fsp--;

            	    match(input,22,FOLLOW_22_in_argument725); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "argument"


    // $ANTLR start "globalConstraints"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:253:1: globalConstraints : constraints[null] ;
    public final void globalConstraints() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:254:3: ( constraints[null] )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:254:5: constraints[null]
            {
            pushFollow(FOLLOW_constraints_in_globalConstraints739);
            constraints(null);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "globalConstraints"


    // $ANTLR start "constraints"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:256:1: constraints[Clause param] : constraint[$param] ( ',' constraint[$param] )* ;
    public final void constraints(Clause param) throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:257:3: ( constraint[$param] ( ',' constraint[$param] )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:257:5: constraint[$param] ( ',' constraint[$param] )*
            {
            pushFollow(FOLLOW_constraint_in_constraints751);
            constraint(param);

            state._fsp--;

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:257:24: ( ',' constraint[$param] )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:257:25: ',' constraint[$param]
            	    {
            	    match(input,18,FOLLOW_18_in_constraints755); 
            	    pushFollow(FOLLOW_constraint_in_constraints757);
            	    constraint(param);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraints"


    // $ANTLR start "constraint"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:259:1: constraint[Clause param] : ( left '==' right | left '!=' right | left '>' right | left '>=' right | left '<' right | left '<=' right );
    public final void constraint(Clause param) throws RecognitionException {
        Comparable left21 = null;

        Comparable right22 = null;

        Comparable left23 = null;

        Comparable right24 = null;

        Comparable left25 = null;

        Comparable right26 = null;

        Comparable left27 = null;

        Comparable right28 = null;

        Comparable left29 = null;

        Comparable right30 = null;

        Comparable left31 = null;

        Comparable right32 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:260:3: ( left '==' right | left '!=' right | left '>' right | left '>=' right | left '<' right | left '<=' right )
            int alt20=6;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAME) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt20=5;
                    }
                    break;
                case 24:
                    {
                    alt20=2;
                    }
                    break;
                case 26:
                    {
                    alt20=3;
                    }
                    break;
                case 29:
                    {
                    alt20=6;
                    }
                    break;
                case 25:
                    {
                    alt20=1;
                    }
                    break;
                case 27:
                    {
                    alt20=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA20_0==NUMBER) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt20=2;
                    }
                    break;
                case 26:
                    {
                    alt20=3;
                    }
                    break;
                case 29:
                    {
                    alt20=6;
                    }
                    break;
                case 27:
                    {
                    alt20=4;
                    }
                    break;
                case 28:
                    {
                    alt20=5;
                    }
                    break;
                case 25:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:260:5: left '==' right
                    {
                    pushFollow(FOLLOW_left_in_constraint771);
                    left21=left();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_constraint773); 
                    pushFollow(FOLLOW_right_in_constraint775);
                    right22=right();

                    state._fsp--;


                        Constraint constraint = new Equal(left21, right22);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:269:5: left '!=' right
                    {
                    pushFollow(FOLLOW_left_in_constraint785);
                    left23=left();

                    state._fsp--;

                    match(input,24,FOLLOW_24_in_constraint787); 
                    pushFollow(FOLLOW_right_in_constraint789);
                    right24=right();

                    state._fsp--;


                        Constraint constraint = new NotEqual(left23, right24);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;
                case 3 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:278:5: left '>' right
                    {
                    pushFollow(FOLLOW_left_in_constraint799);
                    left25=left();

                    state._fsp--;

                    match(input,26,FOLLOW_26_in_constraint801); 
                    pushFollow(FOLLOW_right_in_constraint803);
                    right26=right();

                    state._fsp--;


                        Constraint constraint = new Greater(left25, right26);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;
                case 4 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:287:5: left '>=' right
                    {
                    pushFollow(FOLLOW_left_in_constraint813);
                    left27=left();

                    state._fsp--;

                    match(input,27,FOLLOW_27_in_constraint815); 
                    pushFollow(FOLLOW_right_in_constraint817);
                    right28=right();

                    state._fsp--;


                        Constraint constraint = new GreaterOrEqual(left27, right28);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;
                case 5 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:296:5: left '<' right
                    {
                    pushFollow(FOLLOW_left_in_constraint827);
                    left29=left();

                    state._fsp--;

                    match(input,28,FOLLOW_28_in_constraint829); 
                    pushFollow(FOLLOW_right_in_constraint831);
                    right30=right();

                    state._fsp--;


                        Constraint constraint = new Less(left29, right30);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;
                case 6 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:305:5: left '<=' right
                    {
                    pushFollow(FOLLOW_left_in_constraint841);
                    left31=left();

                    state._fsp--;

                    match(input,29,FOLLOW_29_in_constraint843); 
                    pushFollow(FOLLOW_right_in_constraint845);
                    right32=right();

                    state._fsp--;


                        Constraint constraint = new LessOrEqual(left31, right32);
                        if (param != null) {
                          param.addConstraint(constraint);
                        } else {
                          language.getTheory().addGlobalConstraint(constraint);
                        }
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraint"


    // $ANTLR start "left"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:315:1: left returns [Comparable value] : op ;
    public final Comparable left() throws RecognitionException {
        Comparable value = null;

        Comparable op33 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:316:3: ( op )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:316:5: op
            {
            pushFollow(FOLLOW_op_in_left865);
            op33=op();

            state._fsp--;


                value = op33;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "left"


    // $ANTLR start "right"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:321:1: right returns [Comparable value] : op ;
    public final Comparable right() throws RecognitionException {
        Comparable value = null;

        Comparable op34 = null;


        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:322:3: ( op )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:322:5: op
            {
            pushFollow(FOLLOW_op_in_right885);
            op34=op();

            state._fsp--;


                value = op34;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "right"


    // $ANTLR start "op"
    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:327:1: op returns [Comparable value] : ( NAME | NUMBER );
    public final Comparable op() throws RecognitionException {
        Comparable value = null;

        Token NAME35=null;
        Token NUMBER36=null;

        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:328:3: ( NAME | NUMBER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NAME) ) {
                alt21=1;
            }
            else if ( (LA21_0==NUMBER) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:328:5: NAME
                    {
                    NAME35=(Token)match(input,NAME,FOLLOW_NAME_in_op905); 

                        value = language.getVariable((NAME35!=null?NAME35.getText():null));
                      

                    }
                    break;
                case 2 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:332:5: NUMBER
                    {
                    NUMBER36=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_op915); 

                        value = new IntegerComparable((NUMBER36!=null?NUMBER36.getText():null));
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_sortSection_in_language48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_objectSection_in_language50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variableSection_in_language52 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_constantSection_in_language54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_theory_in_language56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SORTS_in_sortSection69 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_sortSection71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sorts_in_sortSection73 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_sortSection75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_in_sorts91 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_sorts95 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sort_in_sorts97 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_NAME_in_sort117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECTS_in_objectSection135 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_objectSection137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_objectSortSections_in_objectSection139 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_objectSection141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectsInOneSort_in_objectSortSections151 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_objectSortSections154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_objectsInOneSort_in_objectSortSections156 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_sort_in_objectsInOneSort170 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_objectsInOneSort177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_objects_in_objectsInOneSort179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_in_objectsInOneSort186 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_objectsInOneSort189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_min_in_objectsInOneSort191 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_objectsInOneSort193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_max_in_objectsInOneSort195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_min214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_max234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objects250 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_objects254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_object_in_objects256 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_NAME_in_object272 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_object275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sorts_in_object277 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_object279 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_VARIABLES_in_variableSection299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_variableSection301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableSortSections_in_variableSection303 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_variableSection305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variablesInOneSort_in_variableSortSections317 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_variableSortSections320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variablesInOneSort_in_variableSortSections322 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_sort_in_variablesInOneSort334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_variablesInOneSort341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variables_in_variablesInOneSort343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables357 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_variables361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variable_in_variables363 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_NAME_in_variable378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANTS_in_constantSection396 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_constantSection398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_constantSortSections_in_constantSection400 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_constantSection402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantsInOneSort_in_constantSortSections414 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_constantSortSections417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_constantsInOneSort_in_constantSortSections419 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_sort_in_constantsInOneSort433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_constantsInOneSort441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_constants_in_constantsInOneSort443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_constants457 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_constants461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_constant_in_constants463 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_NAME_in_constant479 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_constant482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_sorts_in_constant484 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_constant486 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_clauses_in_theory504 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_theory506 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_globalConstraints_in_theory508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_clauses520 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_clauses523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_clause_in_clauses525 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_literals_in_clause544 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_clause548 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_constraints_in_clause550 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_literal_in_literals564 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_literals568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_literal_in_literals570 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_lhs_in_literal584 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_sign_in_literal586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rhs_in_literal588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_sign608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_sign618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_lhs636 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_lhs643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_arguments_in_lhs645 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_lhs648 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NAME_in_rhs664 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rhs671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_arguments_in_rhs673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rhs676 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_argument_in_arguments691 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_arguments695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_argument_in_arguments697 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_NAME_in_argument713 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_argument720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_arguments_in_argument722 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_argument725 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_constraints_in_globalConstraints739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_constraints751 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_constraints755 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_constraint_in_constraints757 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_left_in_constraint771 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_constraint773 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_in_constraint785 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_constraint787 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_in_constraint799 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constraint801 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_in_constraint813 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_constraint815 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_in_constraint827 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_constraint829 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_left_in_constraint841 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_constraint843 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_right_in_constraint845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_left865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_right885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_op905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_op915 = new BitSet(new long[]{0x0000000000000002L});

}