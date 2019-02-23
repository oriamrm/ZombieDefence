package codboiiz.origummy.zombiedefence;

import javax.swing.JFrame;

import codboiiz.origummy.zombiedefence.guis.Launcher;

public class Main {

	public static JFrame frame = new JFrame();
	public static long version = 0;
	
	
	//NOTE: I imported the fundemental system from BloBattle (A 2D Game I made), with time we will optimize it for ZombieDefence (Or the other name that we will give this game).

	
	public static void main(String[] args) {
		System.out.println("Hello Apocaliptic World");

		frame.setResizable(false);
		frame.setSize(2000, 1125);
	//	Map.FRAME_HEIGHT = 1089;
	//	Map.FRAME_WIDTH = 1993;
		frame.setLocationRelativeTo(null);
		frame.setTitle("BloBattle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Launcher());
		frame.setVisible(true);
	}

}
