package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("Greeter");
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Good Afternoon "+ name);
	}

}
