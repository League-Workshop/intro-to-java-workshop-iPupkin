package day1.tortoise;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/
public class TurtleTreasureHunt implements KeyEventDispatcher {
	static boolean FoundGirl = false;
	static boolean FoundBoyA = false;
	static boolean FoundBoyB = false;
	static boolean FoundBottle = false;
	static boolean FoundBirds = false;
	static boolean FoundSword = false;
	
	int tortoiseSpeed = 10;
	
	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
		Tortoise.move(10);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.setAngle(180);
		Tortoise.move(10);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
		Tortoise.setAngle(180+90);
		Tortoise.move(10);
	
	
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(10);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
			System.out.println("X: " + tortoiseLocationX);
			System.out.println("Y: " + tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
			if(Tortoise.getX() >= 500 && (Tortoise.getX() <= 510)){
				if(Tortoise.getY() >= 300 && (Tortoise.getY() <= 330)){
					System.out.println("Found Little Girl");
					// make a pop-up tell the Tortoise where to go next
					JOptionPane.showMessageDialog(null, "[Girl] " + "Hello! Please, go talk to my brother...");
					FoundGirl = true;
				}
			}
			
			if(FoundGirl == true){
				if(Tortoise.getX() >= 140 && (Tortoise.getX() <= 150)){
					if(Tortoise.getY() >= 280 && (Tortoise.getY() <= 340)){
						System.out.println("Found Little Boy A");
						JOptionPane.showMessageDialog(null, "[Boy] " + "What?!? You were sent by my sister?");
						JOptionPane.showMessageDialog(null, "[Boy] " + "I'll help save here but first I lost my Map, it was in a bottle...");
						FoundBoyA = true;
						FoundGirl = false;
					}
				}
			}
			if(FoundBoyA == true){
				if(Tortoise.getX() >= 280 && (Tortoise.getX() <= 300)){
					if(Tortoise.getY() >= 370 && (Tortoise.getY() <= 380)){
						System.out.println("Found Bottle");
						JOptionPane.showMessageDialog(null, "[System] " + "You have obtained a Bottle");
						FoundBottle = true;	
					}	
				}
			}
			if(FoundBottle == true){
				if(Tortoise.getX() >= 140 && (Tortoise.getX() <= 150)){
					if(Tortoise.getY() >= 280 && (Tortoise.getY() <= 340)){
						System.out.println("Found Little Boy B");
						JOptionPane.showMessageDialog(null, "[Boy] " + "Thank You!");
						JOptionPane.showMessageDialog(null, "[Boy] " + "Oh No! It's wet...");
						JOptionPane.showMessageDialog(null, "[Boy] " + "Don't Worry, Maybe you can talk to the parrots to see if they know where the Hidden Sword is!");
						FoundBoyB = true;		
					}
				}
			}
			if(FoundBoyB == true){
				if(Tortoise.getX() >= 400 && (Tortoise.getX() <= 460)){
					if(Tortoise.getY() >= 90 && (Tortoise.getY() <= 120)){
						System.out.println("Found Parrots");
						JOptionPane.showMessageDialog(null, "Squack! The Sword is in the eye of a Skull!");
						FoundBirds = true;
					}
				}
			}
			if(FoundBirds == true){
				if(Tortoise.getX() >= 120 && (Tortoise.getX() <= 160)){
					if(Tortoise.getY() >= 30 && (Tortoise.getY() <= 50)){
						System.out.println("Found Sword");
						JOptionPane.showMessageDialog(null, "Found a Sword! Now go attack the Pirate to save the Girl!");
						FoundSword = true;
					}
				}
			}
			if(FoundSword == true){
				if(Tortoise.getX() >= 390 && (Tortoise.getX() <= 430)){
					if(Tortoise.getY() >= 240 && (Tortoise.getY() <= 340)){
						System.out.println("Found Pirate");
						JOptionPane.showMessageDialog(null, "ARR! To deafeat me you must asnwer my riddle correctly!\n");
						String Luck = JOptionPane.showInputDialog("What is easy to loose but hard to find: (Socks or Friend)");
						if(Luck.equalsIgnoreCase("Socks")){
							JOptionPane.showMessageDialog(null, "You have defeated the Pirate and saved the Girl!");
						}
						else{
							JOptionPane.showMessageDialog(null, "The girl was slaughtered, and the Pirate ate you! Better luck next time!");
						}
					}
				}
			}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)		
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Quick! Go Help the Little Girl... Use the space bar to complete actions.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}
public static void main(String[] args) throws MalformedURLException {
	new TurtleTreasureHunt().go();
}
}

