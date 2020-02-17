package lv.olga;

import java.util.Arrays;
import java.util.Scanner;

import lv.olga.test.Options;
import lv.olga.test.Questions;

public class TestJavaProject {

	
	public static void main(String[] args) {
		
		
		Questions[] allQuestions = GetQuestions();

		Scanner sc = new Scanner(System.in);

		for (Questions questions : allQuestions) {
			System.out.println(questions.question);
			System.out.println(Arrays.toString(questions.options));
			int atbilde = sc.nextInt();
			if (atbilde == questions.answer) {
				System.out.println("nais");

			}else {
				System.out.println("Nope");
			}

		}

	}

	private static Questions[] GetQuestions() {
	Questions[] returnArray = new Questions[2];
	Options options = new Options();
	

		returnArray[0] = new Questions("What is Java?", options.options1, 1);
		returnArray[1] = new Questions("What is JDK?", options.options2, 1);
//
		return returnArray;

	}
}

