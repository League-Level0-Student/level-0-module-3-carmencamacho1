
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot loser = new Robot();
		for (int j = 0; j < 15; j++) {
			// 3. ask the user what color they would like the robot to draw
			String color = JOptionPane.showInputDialog("What color would you like your robot tp draw in?");
			if (color.equalsIgnoreCase("blue")) {
				loser.setPenColor(Color.blue);
			}
			if (color.equalsIgnoreCase("black")) {
				loser.setPenColor(Color.black);
			}
			if (color.equalsIgnoreCase("cyan")) {
				loser.setPenColor(Color.cyan);
			}
			if (color.equalsIgnoreCase("dark grey")) {
				loser.setPenColor(Color.darkGray);
			}
			if (color.equalsIgnoreCase("gray")) {
				loser.setPenColor(Color.gray);
			}
			if (color.equalsIgnoreCase("green")) {
				loser.setPenColor(Color.green);
			}
			if (color.equalsIgnoreCase("light gray")) {
				loser.setPenColor(Color.lightGray);
			}
			if (color.equalsIgnoreCase("magenta")) {
				loser.setPenColor(Color.magenta);
			} 
			if (color.equalsIgnoreCase("orange")) {
				loser.setPenColor(Color.orange);
			} 
			if (color.equalsIgnoreCase("pink")) {
				loser.setPenColor(Color.pink);
			} 
			if (color.equalsIgnoreCase("red")) {
				loser.setPenColor(Color.red);
			} 
			if (color.equalsIgnoreCase("white")) {
				loser.setPenColor(Color.white);
			} 
			if (color.equalsIgnoreCase("yellow")) {
				loser.setPenColor(Color.yellow);
			} 

			else {
				loser.setRandomPenColor();
			}

			// 4. use an if/else statement to set the pen color that the user
			// requested

			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 2. set the pen width to 10
			loser.setPenWidth(10);

			// 1. make the robot draw a shape (this will take more than one line
			// of
			// code)
			loser.setSpeed(10);
			loser.penDown();
			for (int i = 0; i < 5; i++) {
				loser.move(100);
				loser.turn(144);

			}

		}

	}
}
