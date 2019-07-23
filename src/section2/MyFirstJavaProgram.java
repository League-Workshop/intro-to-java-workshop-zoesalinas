package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot cat= new Robot();
    cat.setSpeed(100);
    cat.penDown();
    for(int i=0; i<4;i++) {
    	cat.setRandomPenColor();
    	cat.turn(90);
    	cat.move(200);
    }
	}
}
