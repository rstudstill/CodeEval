import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Poker Hands - Hard
 * Compare two poker hands
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		try{
			//File file = new File(args[0]);
			File file = new File("test.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while( (line = in.readLine()) != null )
			{
				//do
			}
			in.close();
		}catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
}
