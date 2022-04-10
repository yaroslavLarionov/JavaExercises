import java.util.Arrays;

public class ReversingEachElementOFArray {
	public static void main(String[] args) {

		String[] strArr = { "One", "Two", "Three", "Four", "Five" };
		String empty = "";
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = revStr(strArr[i]);

		}

		System.out.println(Arrays.toString(strArr));

	}
	 static String revStr(String str) {
		String myString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			myString += str.charAt(i);
		}
		return myString;
	}
	
}