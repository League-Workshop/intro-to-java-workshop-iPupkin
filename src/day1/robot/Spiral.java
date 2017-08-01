package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		int sides = 3;
		// 1. Create a new Robot
		Robot RubRub = new Robot();
		// 5. Set your robot's pen to the down position
			RubRub.penDown();
		// 3. Set the robot to go at max speed (10)
			RubRub.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
			for (int i = 0; i < 75; i++) {		
			// 7. Change the pen color to random
				RubRub.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
				RubRub.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			RubRub.turn(360/sides);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
			sides = 7;
			// 9. Set the pen width to i
			RubRub.setPenWidth(i);
			}
	}
}
