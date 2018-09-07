package similarLetters;

public class ProblemTwo {

	public static void main(String[] args) {
		LetterOne();
		LetterTwo();
		LetterThree();
	}
	public static void LetterOne() { // First "Paragraph", uses repeat
		System.out.println("I like trains");
		CommonParagraph();
	}
	public static void LetterTwo() {// Second "Paragraph", uses repeat
		System.out.println("She likes animals");
		CommonParagraph();
	}

	public static void LetterThree() {// Third "Paragraph", uses repeat
		System.out.println("He likes cars.");
		CommonParagraph();
	}
	public static void CommonParagraph() { // The repeating method.
		System.out.println("Because they're fun");
	}
	
}
