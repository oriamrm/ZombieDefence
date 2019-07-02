package codboiiz.origummy.zombiedefence;

import java.awt.Polygon;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import codboiiz.origummy.zombiedefence.guis.Display;
import codboiiz.origummy.zombiedefence.guis.Launcher;

public class Main {
	public static Timer engine = new Timer("Game Engine");
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
	
	public static void mainLoop() {
		engine.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				Polygon poly = Display.polygons.get("Test");
				poly.translate(1, 0);
				Display.polygons.put("Test", poly);
			}
		}, 0, 1);
	}
	
	public static void startGame() {
		Display display = new codboiiz.origummy.zombiedefence.guis.Display();	
		frame.getContentPane().removeAll();
		frame.add(display);
	//	frame.addKeyListener(new Input());
		frame.requestFocus();
		frame.setVisible(true);
		
		
		
		Display.polygons.put("Test", new Polygon(new int[] {50, 150, 300, 70}, new int[] {50, 70, 150, 300}, 4));
		
		
		
	//	Corners: (50,50), (150,70), (300,150)
	// "TimerTask" 
	}

}
