/**(Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).

(a) Next-line brace style
public class Test
{
public static void main(String[] args)
{
// Some statements
}
}

(b) End-of-line brace style
public class Test {
public static void main(String[] args) {
// Some statements
}
}


Your program can be invoked from the command line with the Java sourcecode
file as the argument. It converts the Java source code to a new format. For
example, the following command converts the Java source-code file Test.java
to the end-of-line brace style.
java Exercise12_12 Test.java*/
package zadaci_16_02_2016;

import java.io.*;
import java.util.*;

public class Reformat {

	public static void main(String[] args) throws FileNotFoundException {
		File source = new File("sometext.txt");
		if (!source.exists()) {
			System.out.println("File does not exist.");
			System.exit(1);
		}
		File target = new File("sometext2.txt");
		if (target.exists()) {
			System.out.println("File already exist.");
			System.exit(2);
		}
		//startC https://github.com/LuizGsa21/intro-to-java-10th-edition/blob/master/src/Chapter_12/Exercise_12.java
		 StringBuilder SB = new StringBuilder();
	        try {
	            Scanner input = new Scanner(source);
	            while (input.hasNext()) {
	                String a = input.nextLine();

	                if (a.contains("{")) {
	                    SB.append(" {");
	                } else {
	                    SB.append("\n" + a );
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        try {
	            PrintWriter output = new PrintWriter(target);
	            output.write(SB.toString());
	            output.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        System.out.println(SB);
	        //end C
		}

}
