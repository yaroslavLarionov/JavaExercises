
public class PrintingValuesOf2DArray {
	public static void main(String[] args) {

		String[][] rows = {
				{"apple", "orange"},
				{"kiwi", "banana"},
				{"blueberry", "pineapple", "berry"}};
		System.out.println(rows.length);    //3
		System.out.println(rows[0].length); //2
		System.out.println(rows[1].length); //2
		System.out.println(rows[2].length); //3
		
		//TODO print each element of rows 2 dimensional array on new line
		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < rows[i].length; j++) {
				System.out.println(rows[i][j]);
			}
		}
		System.out.println("-----------------");
		for (String[] arr : rows) {    //outer loop - each element is an array itself
			for (String str : arr) {       // inner loop - each element inside outer array is a String value
				System.out.println(str);
			}
		}
		
		// if we need to manipulate the data like changing the values to all upper case, then we use only for loop, if no
	}

}
