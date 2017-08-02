package day3;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class HelloWorld {
	 public static void main(String[] args) {
		System.out.println("Hello World");
		String name = JOptionPane.showInputDialog("What is your name?");
		String stars = JOptionPane.showInputDialog("How many Stars do you want?");
		JOptionPane.showMessageDialog(null, name + stars);
	}
}
