package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String revword = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revword = revword + str.charAt(i);
		}
		System.out.println(revword);
		if (revword.equals(str)) {
			System.out.println("Given word is palindrome");
		} else {
			System.out.println("Given word is not a palindrome");
		}
	}
}


