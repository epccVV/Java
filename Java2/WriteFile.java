/* This file compiles and runs but something is wrong with the file. Please discover the issue. (Perhaps improve it?) */

public class WriteFile
{
	public static void main(String[] args)
	{
		PrinterWriter theFileMaker = new PrinterWriter("Tester.java");

		theFileMaker.println("public class Tester");
		theFileMaker.println("{");
		theFileMaker.println("\tpublic static void main(String[] args)");
		theFileMaker.println("\t{");
		theFileMaker.println("\t\t");
		theFileMaker.println("\t}");
		theFileMaker.println("}");
	}
}


/* The author wants to note a couple of things to the readers. Do you know what the purpose of this program is? 
It's a Java script (lol)  that can be used to write out the simple skeleton of a java program. We can make this
better by accepting the args as the name of the file and the class name so they can match. We can improve this
later and perhaps contribute to the GitHub. Enjoy programming :) */