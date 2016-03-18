import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Fizz Buzz - Easy
 * 
 * Input Sample:
 * Your program should accept a file as its first argument. 
 * The file contains multiple separated lines; each line 
 * contains 3 numbers that are space delimited. The first 
 * number is the first divider (X), the second number is 
 * the second divider (Y), and the third number is how far you 
 * should count (N). You may assume that the input file is 
 * formatted correctly and the numbers are valid positive integers.
 * 
 * Output Sample:
 * Print out the series 1 through N replacing numbers divisible by X with “F”, 
 * numbers divisible by Y with “B” and numbers divisible by both with “FB”. 
 * Since the input file contains multiple sets of values, your output should 
 * print out one line per set. Ensure that there are no trailing empty spaces 
 * in each line you print.
 */

public class Main 
{
	public static void main(String[] args)
	{
        try {
        	//File file = new File(args[0]);
        	File file = new File("test.txt");
        	BufferedReader in = new BufferedReader(new FileReader(file));
        	String line;
        	int x, y, n;
        	while( (line = in.readLine()) != null )
        	{
        		//line = line.trim();
        		String[] lineArray = line.split("\\s");
        		if( lineArray.length > 0 )
        		{
        			x = Integer.parseInt(lineArray[0]);
        			y = Integer.parseInt(lineArray[1]);
        			n = Integer.parseInt(lineArray[2]);
        			
        			for(int i=1; i <= n; i++)
        			{
        				if( (i%x) == 0 &&
        						(i%y) == 0 )
        					System.out.print("FB");
        				else if( (i%x) == 0 )
        					System.out.print("F");
        				else if( (i%y) == 0 )
        					System.out.print("B");
        				else
        					System.out.print(i);
        				
        				//To ensure no trailing space
        				if( i < n )
        					System.out.print(" ");
        			}
        			System.out.println();
        		}
        	}
        	
        	in.close();
        } catch(IOException e) {
        	System.out.println("File Read Error: " + e.getMessage());
        } catch(NumberFormatException e) {
        	System.out.println("Invalid Number");
        }
    }
}
