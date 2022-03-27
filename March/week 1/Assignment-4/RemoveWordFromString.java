package assignment_4;
import java.util.*;
public class RemoveWordFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = sc.nextLine();
		System.out.println("Which word you want to remove?");
		String word = sc.next();
		
		sentence = sentence.replaceAll(word, "");
		System.out.println(sentence);
	}
}
