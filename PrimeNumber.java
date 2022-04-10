
public class PrimeNumber {
	public static void main(String[] args) {
		
		// A prime number is a number that is divisible by only two numbers: 1 and itself.
		// So, if any number is divisible by any other number, it is not a prime number.
		
		System.out.println(isPrimeNumber(81)); // false
		System.out.println(isPrimeNumber(37)); // true
		System.out.println(isPrimeNumber(7)); // true
		System.out.println(isPrimeNumber(13)); // true	
		System.out.println(isPrimeNumber(19)); // true
    }
  
	public static boolean isPrimeNumber(int num) {
		for (int i = 2; i <= num/2; i++) { //Here, note that we are looping from 2 to num/2. It is because a number is not divisible by more than its half.
          if (num % i == 0) {
            return false;
          }
        }
		return true;
	}
}