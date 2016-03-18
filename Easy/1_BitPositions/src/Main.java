import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Bit Positions - Easy
 * 
 * Given a number n and two integers p1,p2 determine if the bits in
 * position p1 and p2 are the same or not. Positions p1 and p2 are 1 based.
 * 
 * Input: The first argument will be a path to a filename containing a
 * comma separated list of 3 integers, one list per line. 
 * 
 * Output: Print to stdout, 'true'(lowercase) if the bits are the
 * same, else 'false'(lowercase)
 */

public class Main {
	
	public static void main(String[] args) {
		
		try {
			File file = new File(args[0]);
			//File file = new File("test.txt");
			BufferedReader in = new BufferedReader( new FileReader(file));
			String line;
			int n, p1, p2;
			while( (line = in.readLine()) != null )
			{
				String[] lineArray = line.split(",+");
				
				n = Integer.parseInt(lineArray[0]);
				p1 = Integer.parseInt(lineArray[1]);
				p2 = Integer.parseInt(lineArray[2]);
				
				p1 = (n >> (p1-1)) & 1;
				p2 = (n >> (p2-1)) & 1;
				
				if(p1 == p2)
					System.out.println(true);
				else
					System.out.println(false);
			}
			in.close();
		} catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}

}
