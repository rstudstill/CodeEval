//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/* Fibonacci Series - Easy
 * 
 * The Fibonacci series is defined as:
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2) when n > 1
 * 
 * Given an integer n >= 0, print out the F(n)
 * 
 * Input:
 * First argument will be a path to a filename containing 
 * integer numbers, one per line
 * 
 * Output:
 * Print to stdout, the fibonacci number, F(n)
 */

public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			//File file = new File("test.txt");
			Scanner in = new Scanner(file);
			int n;
			while( in.hasNextInt() ) {
				n = in.nextInt();
				
				System.out.println( recFib(n) );
			}
			in.close();
		} catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}

	//Recursively find Fibonacci Value
	public static int recFib(int n) {
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else {
			return recFib(n-1) + recFib(n-2);
		}
	}
}
