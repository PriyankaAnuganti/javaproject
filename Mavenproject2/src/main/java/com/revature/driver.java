package com.revature;
import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		String q1 = "Do you like meeting new people?\n"
				+"(a)yes\n(b)no\n";
		String q2 = "Do you setup longterm goals?\n"
				+"(a)yes\n(b)no\n";
		String q3 = "Do you like helping people out?\n"
				+"(a)yes\n(b)no\n";
		String q4 = "How long do you spend with your mobile?\n"
				+"(a)3 hours\n(b)6 hours\n";
		PersonalityTest [] questions = { 
				new PersonalityTest(q1, "a"),
				new PersonalityTest(q2, "a"),
				new PersonalityTest(q3, "a"),
				new PersonalityTest(q4, "a")
		};
		takeTest(questions);
	}
		
		
	public static void  takeTest(PersonalityTest [] questions) {
		Scanner Input = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = Input.nextLine();
			if(answer.equals(questions[i].answer)) {
				System.out.println("you are cool");
			} else {
			
			    System.out.println("you have a good personality");
				 }
				}
			}
			
		
		
	}



