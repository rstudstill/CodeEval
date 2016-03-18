import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Reverse Words - Easy
 * 
 * Write a program which reverses the words in an input sentence.
 * 
 * Input: The first argument is a file that contains multiple sentences, 
 * one per line. Empty lines are also possible.
 * 
 * Output: Print to stdout each sentence with the reversed words in it, 
 * one per line. Empty lines in the input should be ignored. Ensure that 
 * there are no trailing empty spaces in each line you print.
 */

public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while( (line = in.readLine()) != null )
			{
				String[] lineArray = line.split("\\s");
				//If the line isn't empty, enter
				int length = lineArray.length;
				if( lineArray[0].length() > 0 )
				{
					for(int i=1; i <= length; i++)
					{
						System.out.print(lineArray[length - i]);
						
						if( i < length )
							System.out.print(" ");
					}
					System.out.println();
				}
			}
			in.close();
		} catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
}
