import java.util.Arrays;

public class SortingArrayDescendingOrder {
	public static void main(String[] args) {
		
		int[] arr = {-4, 4, 23, 3, 2, 7};
		int temp = 0;
		System.out.println("Original array: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

}
