package week1.day2;

import java.util.Arrays;

public class FindIntersectionOfArray {

	public static void main(String[] args) {
		int f[] = { 3, 2, 11, 4, 6, 7 };// 2,3,4,6,7,11
		int s[] = { 1, 2, 8, 4, 9, 7 };// 1,2,4,7,8,9
		Arrays.sort(f);
		Arrays.sort(s);
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (f[i] == s[j]) {
					System.out.println("The intersection number is:" + f[i]);
				}
			}
		}

	}

}
