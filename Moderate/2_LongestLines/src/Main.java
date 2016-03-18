import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Longest Lines - Moderate
 * 
 * Write a program which reads a file and prints to stdout the specified number 
 * of the longest lines that are sorted based on their length in descending order.
 * 
 * Input:
 * Your program should accept a path to a file as its first argument. The file contains
 * multiple lines. The first line indicates the number of line you should output, the other
 * lines are of different length and are presented randomly. You may assume that the input file
 * is formatted correctly and the number in the first line is a valid positive integer.
 * Example:
 * 2
 *Hello World
 * CodeEval
 * Quick Fox
 * A
 * San Francisco
 * 
 * Output:
 * Print out the longest lines limited by specified number and sorted by their length in
 * descending order.
 * Example:
 * San Francisco
 * Hello World
 */


public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader( new FileReader(file));
			String line;
			int n = Integer.parseInt( in.readLine() ); //num lines to output
			List<String> input = new ArrayList<String>();
			List<String> output = new ArrayList<String>();
			//Read in lines
			while( (line = in.readLine()) != null )
				input.add(line);
				
			//Add n longest lines from input to output
			for(int i=0; i < n; i++) {
				output.add( findLongest(input) );
			}
			
			//Print output
			for(int i=0; i < output.size(); i++)
				System.out.println(output.get(i));
			
			in.close();
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
	
	//Find longest line in list, put it in output, and removes from input list
	public static String findLongest(List<String> input) {
		String longest = input.get(0);
		int n=0;
		
		//Find longest line
		for(int i=1; i < input.size(); i++) {
			if( input.get(i).length() > longest.length() ) {
				longest = input.get(i);
				n = i; //Index of longest line
			}
		}
		input.remove(n); //Remove longest line from input list
		return longest;
	}
}
