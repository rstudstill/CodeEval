import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* Overlapping Rectangles - Moderate
 * 
 * Objective: Given two axis aligned rectangles A and B,
 * determine if the two overlap. The rectangles are considered
 * overlapping if they have at least one common point.
 * 
 * Input: Your program should accept as its first argument a
 * path to a filename. Each line in this file contains 8 comma
 * separated coordinates. The coordinates are 
 * upper left x of A, upper left y of A, lower right x of A, lower right x of A
 * upper left x of B, upper left y of B, lower right x of B, lower right y of B
 * E.g.
 * -3,3,-1,1,1,-1,3,-3
 * -3,3,-1,1,-2,4,2,2
 * 
 * Output: Print out True or False if A and B intersect
 * E.g.
 * False
 * True
 */
public class Main {

	public static void main(String[] args) {

	}

	//Read in input file
	public static void readFile( String input ) throws Exception
	{
		File file = new File(input);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while( (line = in.readLine()) != null )
		{
			//solve
		}
		in.close();
	}
	
	//Create squares
	public static void createSquares( String line )
	{
		String[] temp = line.split(",");
	}
	
}
