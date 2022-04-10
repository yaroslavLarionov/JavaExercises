
public class Fibonacci {
	public static void main(String[] args) {
		
		//It is a series of numbers where the next number is the sum of the previous two numbers. 
		//The first two numbers of the Fibonacci are 0 followed by 1. Write a method that will accept one int number n. 
		//The method will print n number of Fibonacci numbers in the same line with space-separated.
		
		fib(3); // -> 0 1 1
		fib(5); // -> 0 1 1 2 3
		fib(6); // -> 0 1 1 2 3 5
		fib(10); // -> 0 1 1 2 3 5 8 13 21 34
		System.out.println("-------------------");
		//finding the N-th fibonacci number
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(10));
	}

	public static void fib(int n) {
		int firstNumber = 0;
		int secondNumber = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(firstNumber + " ");
			int sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;

		}
		System.out.println();

	}
	// to get the n-th fibonacci number
	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return (fibonacci(n - 1) + fibonacci(n - 2));
	}

}
	