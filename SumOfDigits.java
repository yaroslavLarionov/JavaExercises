
public class SumOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		//TODO Find the sum of number 1 + 2 + 3 + 4 + 5 = 15 -> output is 15
		
		/*
		 * Option #1:
		 * 1. Create empty sum variable that will hold actual sum
		 * 2. Convert to String and loop over String by getting each char
		 * 3. Convert each char to int and add to the sum variable
		 */
		String strNum = String.valueOf(num);
		for (char ch : strNum.toCharArray()) {    //the loop makes it an array of chars
			sum += Integer.parseInt(String.valueOf(ch));         //it gets the string value of char, converts it to int and adds to sum
		}
		System.out.println("sum 1: " + sum);
		
		/*
		 * Option #2:
		 * % and /
		 * any number you %10 will give you last digit
		 * any number you /10 will remove last digit
		 */
		int num2 = 12345;
		int sum2 = 0;
		while (num2 > 0) {
			sum2 += num2 % 10;
			num2 = num2 / 10;
		}
		System.out.println("sum 2: " + sum2);
	}

}
	