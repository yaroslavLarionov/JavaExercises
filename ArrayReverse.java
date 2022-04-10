import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {

		// reversing array by swapping first element with the last, 2nd element with
		// second to last and so on.
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Original array: " + Arrays.toString(numbers));
		int n;
		for (int i = 0; i < numbers.length / 2; i++) {
			n = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = n;
		}
		System.out.println("Reversed array: " + Arrays.toString(numbers));
		System.out.println("-----------------");

		// reversing array by using the StringBuilder.append() method, we can use a StringBuilder and append each array element with
		// a for loop decrementing from the array’s length, convert the StringBuilder to a string, and split back into an array.
		String[] numbers2 = { "One", "Two", "Three", "Four", "Five" };
		StringBuilder sb = new StringBuilder();
		for (int i = numbers2.length; i > 0; i--) {
			sb.append(numbers2[i - 1]).append(" ");
		}
		String[] reversedNumbers2 = sb.toString().split(" ");
		System.out.println(Arrays.toString(reversedNumbers2));
	}

}
