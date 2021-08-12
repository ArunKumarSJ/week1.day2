package week1.day2;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int i=0;i<data.length;i++) {
			System.out.println("The sorted Array is:"+ data[i]);
		}
		int l=data.length;
		System.out.println("The Second Largest Number is:" + data[l-2]);
	}

}
