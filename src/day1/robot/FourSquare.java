package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot rub = new Robot();

	void go() {
		rub.penDown();
		// 4. Make the robot move as fast as possible
		rub.setSpeed(999);
		// 5. Set the pen width to 5
		rub.setPenWidth(10);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {			
		// 7. Set the pen color to random	
			rub.setRandomPenColor();
		// 1. Call the drawSquare() method	
			rub.move(100);
		// 8. Turn the robot 90 degrees to the right
			rub.turn(90);
			}
		rub.hide();
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
