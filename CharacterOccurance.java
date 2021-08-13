package week1.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "welcoee to chennai";
		int count = 0;
		char Ar[] = str.toCharArray();
		int Length = Ar.length;
		System.out.println("The Length of an Array is:" + Length);
		for (int i = 0; i < Ar.length; i++) {
			if (Ar[i] == 'e')

				count = count + 1;

		}
		System.out.println("Character Occurance of E is :" + count);
	}

}
