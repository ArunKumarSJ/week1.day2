package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "pots";
		if (text1.length() == text2.length()) {

			char[] a = text1.toCharArray();
			char[] b = text2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);
			boolean Result = Arrays.equals(a, b);
			if (Result == true) {
				System.out.println("strings are anagram");
		
			} else {
				System.out.println("strings are not anagram");
				
			}
		}
		else {
		System.out.println("Length of the strings are not equal");
	}
}
}