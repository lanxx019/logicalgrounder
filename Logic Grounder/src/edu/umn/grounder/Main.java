package edu.umn.grounder;

import org.antlr.runtime.*;

import edu.umn.grounder.parser.*;

public class Main {
	private static String inputFileName;
	
	public static void main(String[] args) throws Exception {
		handleArguments(args);
		GrounderLexer lex = new GrounderLexer(new ANTLRFileStream(inputFileName));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		GrounderParser parser = new GrounderParser(tokens);
		try {
            parser.language();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        LogicContext language = parser.getLanguage();
        language.init();
        System.out.println(language.toString());
	}
	
	public static void handleArguments(String[] args) {
		if (args.length != 1) {
			System.out.println("Wrong number of arguments.");
			printHelpMessage();
			System.exit(1);
		} else {
			inputFileName = args[0];
		}
	}
	
	public static void printHelpMessage() {
		String msg = "";
		msg += "Logical Grounder Usage:\n";
		msg += "  java -jar grounder.jar inputfile\n";
		msg += "     inputfile: the language definition input file.";
		System.out.println(msg);
	}
}
