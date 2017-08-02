package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
			JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
			String Adjective = JOptionPane.showInputDialog("ENTER A ADJACTIVE");
		// Get the user to enter a type of liquid
			String Liquid = JOptionPane.showInputDialog("ENTER A TYPE OF LIQUID");
		// Get the user to enter a body part
			String Body = JOptionPane.showInputDialog("ENTER A BODY PART");
		// Get the user to enter a verb
			String Verb = JOptionPane.showInputDialog("ENTER A VERB");
		// Get the user to enter a place
			String Place = JOptionPane.showInputDialog("ENTER A PLACE");
		// Fit the user's words into this sentence, and save it in a String:
			JOptionPane.showMessageDialog(null, "Piranhas are more " + Adjective + " during the day, so cross the river at\n" + 
												"night. Piranhas are attracted to fresh "+ Liquid + " and will most\n" + 
												"likely take a bite out of your " + Body + " if you " + Verb + ". Whatever\n" +
												"you do, if you have an open wound, try to find another way to get\n" +
												"back to the "+ Place + ". Good luck!\n");
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
	}
}

