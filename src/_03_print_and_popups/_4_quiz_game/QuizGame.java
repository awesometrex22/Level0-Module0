package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog("What is my name?");
		if (question.equals("Steve")) {;
		score+=1;
		}
		String question2 = JOptionPane.showInputDialog("What is the capital of Canada");
		if (question2.equals("Toronto")) {;
		score+=1;
		}
		String question3 = JOptionPane.showInputDialog("What is the capital of Korea");
		if (question3.equals("Seoul")) {;
		score+=1;
		}
		String question4 = JOptionPane.showInputDialog("What is 2x2");
		if (question4.equals("4")) {;
		score+=1;
		}
		JOptionPane.showMessageDialog(null, "Your final score is"+score);
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
