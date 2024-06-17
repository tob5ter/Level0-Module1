package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle=JOptionPane.showInputDialog("what tastes better than it smells?");
		String answer="a tongue";
		String a=JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		String ab="a candle";
		String b=JOptionPane.showInputDialog("What has hands but can not clap??");
		String bb="a clock";
		String c=JOptionPane.showInputDialog("What kind of room has no doors or windows");
		String cb="a mushroom";

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals(answer)){
			score = score+1;
			JOptionPane.showMessageDialog(null,"correct!");
		}
		else JOptionPane.showMessageDialog(null,"wrong!");
		if (a.equals(ab)){
			score = score+1;
			JOptionPane.showMessageDialog(null,"correct!");
		}
		else JOptionPane.showMessageDialog(null,"wrong!");
		if (b.equals(bb)){
			score = score+1;
			JOptionPane.showMessageDialog(null,"correct!");
		}
		else JOptionPane.showMessageDialog(null,"wrong!");
		if (c.equals(cb)){
			score = score+1;
			JOptionPane.showMessageDialog(null,"correct!");
		}
		else JOptionPane.showMessageDialog(null,"wrong!");
		// 5. Otherwise, say "wrong" and tell them the answer
		JOptionPane.showMessageDialog(null,"your final score is " +score);

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

