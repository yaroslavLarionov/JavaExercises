public class IfNumberEqualsBackwards_noStringConversion {
	public static void main(String[] args) {
    	boolean isPal = isPalNum(1001);
        System.out.println(isPal); // true
    }
  
    public static boolean isPalNum(int num) {
    	int newNum = num;
    	int reverseNum = 0;
        int remainder = 0;
        while (newNum != 0) {
          remainder = newNum % 10;
          reverseNum = reverseNum * 10 + remainder;
          newNum /= 10;
        }
        return num == reverseNum;
    }
}