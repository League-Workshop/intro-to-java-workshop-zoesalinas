package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random gen= new Random();
	int random= gen.nextInt(3);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Enter something below that you think is awesome");
	// 5. If the random number is 0
if (random==0) {
JOptionPane.showMessageDialog(null, "Your thing is awesome!");	
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (random==1) {
JOptionPane.showMessageDialog(null, "Your thing is ok.");	
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (random==2) {
JOptionPane.showMessageDialog(null, "Your thing is so boring.");	
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
}
}


