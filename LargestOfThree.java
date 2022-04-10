
public class LargestOfThree {
	public static void main(String[] args) {
		
		//Option #1: using the if statement and comparing each number
		int num1 = 4;
		int num2 = 34;
		int num3 = -15;
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest of three numbers");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest of three numbers");
		} else {
			System.out.println(num3 + " is the largest of three numbers");
		}
		
		System.out.println("The largest of three numbers is: " + largestNum(num1, num2, num3));
	}
	//Option #2: using the built-in Math.max method
	public static int largestNum(int num1, int num2, int num3) {
		int largestNum = Math.max(Math.max(num1, num2), num3);
		return largestNum;
	}

}
