import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Multiples of a Number - Easy
 * 
 * Given numbers x and n, where n is a power of 2, print out the 
 * smallest multiple of n which is greater than or equal to x. Do not use division or modulo operator.
 *
 * Input: The first argument will be a path to a filename containing a comma 
 * separated list of two integers, one list per line.
 *
 * Output: Print to stdout, the smallest multiple of n which is greater 
 * than or equal to x, one per line.
 */

public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			int x, n, temp;
			while( (line = in.readLine()) != null )
			{
				String[] lineArray = line.split(",+");
				
				x = Integer.parseInt(lineArray[0]);
				n = Integer.parseInt(lineArray[1]);
				temp = n;
				
				while( x >= temp )
				{
					temp = temp << 1;
				}
				
				while( temp >= x )
				{
					temp -= n;
				}
				System.out.println(temp+n);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
}
