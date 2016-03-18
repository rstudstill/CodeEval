import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Sum of Digits - Easy
 * 
 * Given a positive integer, 
 * find the sum of its constituent digits.
 * 
 * Input: The first argument will be a path to a filename 
 * containing positive integers, one per line.
 * 
 * Output: Print to stdout, the sum of the numbers that 
 * make up the integer, one per line.
 */


public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			int n, sum;
			while( (line = in.readLine()) != null )
			{
				n = Integer.parseInt(line);
				sum = 0;
				
				while( n != 0 )
				{
					sum += n % 10;
					n /= 10;
				}
				System.out.println(sum);
			}
			
			in.close();
		} catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}

}
