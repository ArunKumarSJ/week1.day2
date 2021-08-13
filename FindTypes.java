package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation&$$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char B[] = test.toCharArray();
		for (int i = 0; i < B.length; i++) {
			if (Character.isDigit(B[i])) {
				num = num + 1;

			} else if (Character.isSpaceChar(B[i])) {
				space = space + 1;

			} else if (Character.isAlphabetic(B[i])) {
				letter = letter + 1;
			}
			else {
				specialChar=specialChar+1;
			}
		}
		System.out.println("num:"+num);
		System.out.println("letter:"+space);
		System.out.println("space:"+letter);
		System.out.println("specialcharacter:"+specialChar);
	}

}
