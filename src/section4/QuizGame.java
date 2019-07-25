package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog(null, "What does the Imperius Curse do in Harry Potter?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("Controls")) {
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		
		// 4.  if the user's answer was correct, add one to their score 

		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2= JOptionPane.showInputDialog(null, "Who is Fluffy in Harry Potter?");
		if (answer2.equalsIgnoreCase("a three legged dog")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String answer3= JOptionPane.showInputDialog(null, "What position does Harry play in his Quidditch team in Harry Potter?");
		if (answer3.equalsIgnoreCase("Seeker")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String answer4= JOptionPane.showInputDialog(null, "What house is Harry in, in Harry Potter?");
		if (answer4.equalsIgnoreCase("Gryffindor")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		String answer5= JOptionPane.showInputDialog(null, "Who kills Professor Dumbledore in Harry Potter?");
		if (answer5.equalsIgnoreCase("Snape")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is" + score);
	}
}
