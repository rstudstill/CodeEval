import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Lowercase - Easy
 * 
 * Given a string write a program to convert it into lowercase.
 * 
 * Input: The first argument will be a path to a filename containing 
 * sentences, one per line. You can assume all characters are from the english language
 * 
 * Output: Print to stdout, the lowercase version of the sentence, each on a new line.
 */

public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			//File file = new File("test.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while( (line = in.readLine()) != null )
			{
				System.out.println(line.toLowerCase());
			}
			in.close();
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}

}
