package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String sentence = JOptionPane.showInputDialog("If you fine yourself having to cross"
				+ " a piranha-infested river, here's how to do it. . . .");
		// Get the user to enter an adjective
String adjective = JOptionPane.showInputDialog(null, "Put in a adjective below");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog(null, "Enter a type of liqiud");
		// Get the user to enter a body part
String bodypart = JOptionPane.showInputDialog(null, "Enter a body part");
		// Get the user to enter a verb
String verb = JOptionPane.showInputDialog(null, "Enter a verb");
		// Get the user to enter a place
String place = JOptionPane.showInputDialog(null, "Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		String story =  "Piranhas are more " + adjective +"during the day, so cross the river at night. Piranhas are attracted to fresh " +liquid +" and will most likely take a bite out of your " +bodypart +" if you " +verb +". Whatever you do, if you have an open wound, try to find another way to get back to the "+place +". Good luck!";
		JOptionPane.showMessageDialog(null, story);
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

