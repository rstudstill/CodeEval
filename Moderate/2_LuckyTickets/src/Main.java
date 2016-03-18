import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* Lucky Tickets - Moderate
 * 
 * We can receive a lucky ticket in a public transport. How to reveal whether
 * the ticket is lucky or not? We call a ticket lucky if the sum of its digits
 * in the first half equals to the sum of digits in the second half. For example,
 * ticket 328940 is a lucky one because 3+2+8=9+4+0. 
 * Write a program that will count the maximum number of lucky tickets depending
 * on the length of the ticket number. In other words, how many lucky combinations
 * can be if a ticket number comprises 4, 6, 8, … digits ?
 * 
 * Input: The first argument is a path to a file. Each line includes a test case
 * with an even number that indicates the length of the ticket number.
 * 
 * Output: Count and print the maximum possible number of lucky tickets depending
 * on the length of the ticket number.
 * 
 * Constraints:
 * 1. The length of a ticket number can be from 2 to 100 digits.
 * 2. Tickets 000000 and 999999 should be also counted.
 * 3. All the input numbers are even.
 * 4. The number of test cases is 40.
 */

public class Main {

	public static void main(String[] args) {

		String str1 = "332664";
		
		System.out.println(str1.length());
		
	}
	
	public static void readFile( String input ) throws Exception
	{
		File file = new File(input);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while( (line = in.readLine()) != null )
		{
			//solve
			ticketNums( Integer.parseInt(line) );
		}
		in.close();
	}
	
	//Generates ticket numbers
	public static int[] ticketNums( int length )
	{
		/* Create two half arrays?
		 *		because don't need to consider values like 0001 or 0010
		 *
		 * Way to cut out repetition?
		 * 		if all digits, even if in different places, have been considered?
		 * 		ex) 0010 0100 and 1000 0010
		 * 
		 * Use D.S. combination/permutation
		 *  [0-9] = 10 possible digits
		 *  length/2 = possible places it could be ?
		 *  		or is it just length, since 0001 0001 vs 0001 0010 and so on
		 *  
		 *  Even if so, how do you then exclude them from other cases such as
		 *  	26 71 or 32 14
		 *  
		 *  Given X number of digits, usings 0-9, how many ways are there to write sum Y?
		 *  	What do you do with that information?
		 */
	}
	
	//Returns the number of ways you can add numbers to reach a certain value
	//For this problem, position unique, so 5+0 != 0+5
	//ex: target=5; 0+5, 1+4, 2+3, etc, return 6
	public static int numCombinations( int length )
	{
		
	}
	
	
	//Returns true if the sum of the first half equals the sum of the second,
	// false otherwise
	public static boolean isLucky( long ticket, int length )
	{
		//Likely don't need, or will change
	}
	}
}
