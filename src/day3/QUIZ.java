package day3;

import javax.swing.JOptionPane;

public class QUIZ {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Welcome To the Quiz Game!");
		int Right = 0;
		int Wrong = 0;
		String Q1 = "Is this Computer an Apple Computer? Y/N";
		String Q2 = "Are we coding in Java Script? Y/N";
		String Q3 = "Does 'www.' stand for (in a website url) World Wide Web? Y/N";
		String Q4 = "Was Abraham Lincoln our 1st President? Y/N";
		String Q5 = "Does RAM stand for Random Access Memory? Y/N";
		
		String A1 = JOptionPane.showInputDialog(Q1);
		if (A1.equalsIgnoreCase("Y")){
			Right = Right + 1;
			JOptionPane.showMessageDialog(null, "Correct!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		else{
			Wrong = Wrong + 1;
			JOptionPane.showMessageDialog(null, "Wrong!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		
		String A2 = JOptionPane.showInputDialog(Q2);
		if (A2.equalsIgnoreCase("N")){
			Right = Right + 1;
			JOptionPane.showMessageDialog(null, "Correct!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		else{
			Wrong = Wrong + 1;
			JOptionPane.showMessageDialog(null, "Wrong!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		
		String A3 = JOptionPane.showInputDialog(Q3);
		if (A3.equalsIgnoreCase("Y")){
			Right = Right + 1;
			JOptionPane.showMessageDialog(null, "Correct!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		else{
			Wrong = Wrong + 1;
			JOptionPane.showMessageDialog(null, "Wrong!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		
		String A4 = JOptionPane.showInputDialog(Q4);
		if (A4.equalsIgnoreCase("N")){
			Right = Right + 1;
			JOptionPane.showMessageDialog(null, "Correct!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		else{
			Wrong = Wrong + 1;
			JOptionPane.showMessageDialog(null, "Wrong!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		String A5 = JOptionPane.showInputDialog(Q5);
		if (A5.equalsIgnoreCase("Y")){
			Right = Right + 1;
			JOptionPane.showMessageDialog(null, "Correct!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		else{
			Wrong = Wrong + 1;
			JOptionPane.showMessageDialog(null, "Wrong!\n" + "Right Answers: " + Right + "\n" + "Wrong Answers: "+ Wrong);
		}
		
	}
}
