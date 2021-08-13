package week1.day2;

import java.util.Arrays;

public class FindDuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };// 11,12,13,14,14,15,16,17,17,18,18,19,20
		Arrays.sort(arr);
		System.out.println(" Sorted Array is" + Arrays.toString(arr));
		int length = arr.length;
		System.out.println("The Length of an array is:" + length);
		int count;
		for (int i = 0; i < arr.length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length - 1; j++) {
				while (arr[i] == arr[j]) {
					count++;
					break;

				}
				if (count > 0) {
					System.out.println("The Duplicate value is" + arr[i]);
					break;
				}
			}

		}
	}

}
