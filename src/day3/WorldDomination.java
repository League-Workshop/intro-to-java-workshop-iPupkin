package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String name = JOptionPane.showInputDialog("Do you know how to write code? Y/N");
		// 2. If they say "yes", tell them they will rule the world.
		if(name.equalsIgnoreCase("y")){
			JOptionPane.showMessageDialog(null, "You will rule the world with an Iron Fist");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Good Luck washing your mothers dishes");
		}
	}
}