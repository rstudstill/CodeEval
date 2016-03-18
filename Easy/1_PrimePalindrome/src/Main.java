//Write a program which determines the largest prime palindrome less than 1000.

public class Main {

	public static void main(String[] args) 
	{
		int temp;
		
		for(int i=999; i >= 0; i--)
		{
			if( isPrime(i) )
			{
				temp = reverseInt(i);
				if( i == temp )
				{
					System.out.print(i);
					break;
				}
			}
		}
	}

	//Returns true if integer n is prime.
	public static boolean isPrime( int n )
	{
		if( n%2 == 0 ) return false;
		
		for(int i=3; i*i <= n; i+=2)
		{
			if( n%i == 0 )
				return false;
		}
		return true;
	}
	
	//Returns the reverse order of an integer
	public static int reverseInt( int n )
	{
		int temp = 0;
		
		while( n != 0 )
		{
			temp = temp*10 + n%10;
			n = n / 10;
		}
		return temp;
	}
}
