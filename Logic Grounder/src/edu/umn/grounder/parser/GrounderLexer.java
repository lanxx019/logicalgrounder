// $ANTLR 3.1.2 /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g 2009-04-02 14:56:23

  package edu.umn.grounder.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrounderLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int SPACE=14;
    public static final int SORTS=4;
    public static final int T__19=19;
    public static final int NAME=5;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int NEWLINE=15;
    public static final int T__17=17;
    public static final int OBJECTS=6;
    public static final int VARIABLES=8;
    public static final int LOWER=10;
    public static final int DIGIT=13;
    public static final int UPPER=11;

    // delegates
    // delegators

    public GrounderLexer() {;} 
    public GrounderLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GrounderLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:11:7: ( ':' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:12:7: ( '.' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:13:7: ( ',' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:14:7: ( ';' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:15:7: ( '...' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:15:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:16:7: ( '(' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:17:7: ( ')' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:18:7: ( '=' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:19:7: ( '!=' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:19:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:20:7: ( '==' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:20:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:21:7: ( '>' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:22:7: ( '>=' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:22:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:23:7: ( '<' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:24:7: ( '<=' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:339:17: ( LOWER | UPPER )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:340:17: ( 'a' .. 'z' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:340:19: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:341:17: ( 'A' .. 'Z' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:341:19: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:342:17: ( '0' .. '9' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:342:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SORTS"
    public final void mSORTS() throws RecognitionException {
        try {
            int _type = SORTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:346:11: ( ( 's' | 'S' ) 'ort' ( 's' )? )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:346:13: ( 's' | 'S' ) 'ort' ( 's' )?
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ort"); 

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:346:29: ( 's' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='s') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:346:30: 's'
                    {
                    match('s'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SORTS"

    // $ANTLR start "OBJECTS"
    public final void mOBJECTS() throws RecognitionException {
        try {
            int _type = OBJECTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:347:11: ( ( 'o' | 'O' ) 'bject' ( 's' )? )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:347:13: ( 'o' | 'O' ) 'bject' ( 's' )?
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("bject"); 

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:347:31: ( 's' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='s') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:347:32: 's'
                    {
                    match('s'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECTS"

    // $ANTLR start "VARIABLES"
    public final void mVARIABLES() throws RecognitionException {
        try {
            int _type = VARIABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:348:11: ( ( 'v' | 'V' ) 'ariable' ( 's' )? )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:348:13: ( 'v' | 'V' ) 'ariable' ( 's' )?
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("ariable"); 

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:348:33: ( 's' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='s') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:348:34: 's'
                    {
                    match('s'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLES"

    // $ANTLR start "CONSTANTS"
    public final void mCONSTANTS() throws RecognitionException {
        try {
            int _type = CONSTANTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:349:11: ( ( 'c' | 'C' ) 'onstant' ( 's' )? )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:349:13: ( 'c' | 'C' ) 'onstant' ( 's' )?
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("onstant"); 

            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:349:33: ( 's' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='s') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:349:34: 's'
                    {
                    match('s'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANTS"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:353:9: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:353:11: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:353:18: ( LETTER | DIGIT | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:354:9: ( '1' .. '9' ( DIGIT )* )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:354:11: '1' .. '9' ( DIGIT )*
            {
            matchRange('1','9'); 
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:354:19: ( DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:354:20: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:355:9: ( ( ' ' | '\\t' )+ )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:355:11: ( ' ' | '\\t' )+
            {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:355:11: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:356:9: ( ( '\\r' )? '\\n' )
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:356:12: ( '\\r' )? '\\n'
            {
            // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:356:12: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:356:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | SORTS | OBJECTS | VARIABLES | CONSTANTS | NAME | NUMBER | SPACE | NEWLINE )
        int alt9=22;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:94: SORTS
                {
                mSORTS(); 

                }
                break;
            case 16 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:100: OBJECTS
                {
                mOBJECTS(); 

                }
                break;
            case 17 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:108: VARIABLES
                {
                mVARIABLES(); 

                }
                break;
            case 18 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:118: CONSTANTS
                {
                mCONSTANTS(); 

                }
                break;
            case 19 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:128: NAME
                {
                mNAME(); 

                }
                break;
            case 20 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:133: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 21 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:140: SPACE
                {
                mSPACE(); 

                }
                break;
            case 22 :
                // /home/blan/Documents/EclipseProjects/Logic Grounder/src/edu/umn/grounder/parser/Grounder.g:1:146: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\24\4\uffff\1\26\1\uffff\1\30\1\32\4\17\14\uffff\10\17"+
        "\1\50\3\17\1\50\1\uffff\3\17\1\60\2\17\1\60\1\uffff\2\17\1\66\1"+
        "\70\1\66\1\uffff\1\70\1\uffff";
    static final String DFA9_eofS =
        "\71\uffff";
    static final String DFA9_minS =
        "\1\11\1\uffff\1\56\4\uffff\1\75\1\uffff\2\75\1\157\1\142\1\141\1"+
        "\157\14\uffff\1\162\1\152\1\162\1\156\1\164\1\145\1\151\1\163\1"+
        "\60\1\143\1\141\1\164\1\60\1\uffff\1\164\1\142\1\141\1\60\1\154"+
        "\1\156\1\60\1\uffff\1\145\1\164\3\60\1\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\1\uffff\1\56\4\uffff\1\75\1\uffff\2\75\1\157\1\142\1\141"+
        "\1\157\14\uffff\1\162\1\152\1\162\1\156\1\164\1\145\1\151\1\163"+
        "\1\172\1\143\1\141\1\164\1\172\1\uffff\1\164\1\142\1\141\1\172\1"+
        "\154\1\156\1\172\1\uffff\1\145\1\164\3\172\1\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\6\1\7\1\uffff\1\11\6\uffff\1\23\1"+
        "\24\1\25\1\26\1\5\1\2\1\12\1\10\1\14\1\13\1\16\1\15\15\uffff\1\17"+
        "\7\uffff\1\20\5\uffff\1\21\1\uffff\1\22";
    static final String DFA9_specialS =
        "\71\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\21\1\22\2\uffff\1\22\22\uffff\1\21\1\10\6\uffff\1\5\1\6\2"+
            "\uffff\1\3\1\uffff\1\2\2\uffff\11\20\1\1\1\4\1\12\1\7\1\11\2"+
            "\uffff\2\17\1\16\13\17\1\14\3\17\1\13\2\17\1\15\4\17\6\uffff"+
            "\2\17\1\16\13\17\1\14\3\17\1\13\2\17\1\15\4\17",
            "",
            "\1\23",
            "",
            "",
            "",
            "",
            "\1\25",
            "",
            "\1\27",
            "\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17\1\47\7\17",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17\1\57\7\17",
            "\1\61",
            "\1\62",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\63",
            "\1\64",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17\1\65\7\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17\1\67\7\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | SORTS | OBJECTS | VARIABLES | CONSTANTS | NAME | NUMBER | SPACE | NEWLINE );";
        }
    }
 

}