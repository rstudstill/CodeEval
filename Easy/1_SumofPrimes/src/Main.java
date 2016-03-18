//Write a program which determines the sum of the first 1000 prime numbers.

public class Main {

	public static void main(String[] args) 
	{
		//Start sum at 2 since isPrime doens't consider it
		//and consequently start count at 1
		int sum=2, count=1;
		//Sum the first 1000 primes
		for(int i=3; count < 1000; i++)
		{
			if( isPrime(i) )
			{
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
	}

	//Returns true if an integer is prime
	public static boolean isPrime( int n )
	{
		if( n%2 == 0 ) return false;
		
		for(int i=3; i*i <= n; i+=2)
		{
			if( n%i == 0 ) return false;
		}
		return true;
	}
}
