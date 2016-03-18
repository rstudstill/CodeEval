import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Interrupted Bubble Sort - Moderate
 *
 *Bubble sort is the simplest algorithm for elements sorting.
 *At each iteration we sequentially compare values of subsequent
 *elements and swap them if necessary.
 *
 *Your job is to write a program which finds a state of a given
 *list of positive integer numbers after applying a given count
 *of bubble sort iterations.
 * 
 * Input: Your program should accept as its first argument a path
 * to a filename. Each line in this file contains a space-separated
 * list of positive integers and ends with a number of iterations,
 * separated by vertical line ‘|’
 * 
 * Output: Print to stdout the state of given lists after applying
 * a given count of bubble sort iterations
 */

public class Main {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);
			//File file = new File("test.txt");
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while( (line = in.readLine()) != null )
			{
				String[] lineArray = line.split("\\|");
				long iter = Long.valueOf(lineArray[1].trim());
				lineArray = lineArray[0].split("\\s"); //array to be sorted

				if( lineArray.length < 2 )
					System.out.println(lineArray[0]);
				else
				{
					long[] nums = convertStringToLong(lineArray);
					BubbleSort(nums, iter);
					printArray(nums);
				}
			}
			in.close();
		} catch(IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}
	}
	
	//Convert array of strings to an array of longs
	public static long[] convertStringToLong( String[] strArray )
	{
		long[] lArray = new long[strArray.length];
		
		for(int i=0; i < lArray.length; i++)
			lArray[i] = Long.valueOf(strArray[i]);
		
		return lArray;
	}

	//Performs X number of iterations on a bubble sort on an array
	public static long[] BubbleSort( long[] array, long x )
	{
		boolean sorted;
		
		//If x is larger than array length
		if( array.length < x )
			x = array.length;
		
		for(int i=1; i <= x; i++)
		{
			sorted = true;
			for(int j=0; j < array.length-i; j++)
			{
				if( array[j] > array[j+1])
				{
					long temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					sorted = false;
				}
			}
			//If you move through the array and don't swap any items, it is sorted
			if( sorted )
				break;
		}
		return array;
	}
	
	public static void printArray( long[] array )
	{
		System.out.print(array[0]);
		for(int i=1; i < array.length; i++)
		{
			System.out.print(" " + array[i]);
		}
		System.out.println();
	} 
}