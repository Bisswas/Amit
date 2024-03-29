import java.util.*; 

class primeNO_By_Recursion { 

	// Returns true if n is prime, else 
	// return false. 
	// i is current divisor to check. 
	static boolean isPrime(int n, int i) 
	{ 

		// Base cases 
		if (n <= 2) 
			return (n == 2) ? true : false; 
		if (n % i == 0) 
			return false; 
		if (i * i > n) 
			return true; 
	
		// Check for next divisor 
		return isPrime(n, i + 1); 
	} 
	
	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=in.nextInt();; 
		if (isPrime(n, 2)) 
			System.out.println("Yes "+n+" is a Prime Number."); 
		else
			System.out.println("No "+n+" is not a Prime Number."); 
	} 
} 



