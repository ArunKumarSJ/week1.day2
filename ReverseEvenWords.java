package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a Software Tester";
		String word[] = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			if (i % 2 ==1) {
				int RL = word[i].length();
				for (int j = RL - 1; j >= 0; j--) {
					System.out.print(word[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(word[i] + " ");
			}

		}

	}

}
