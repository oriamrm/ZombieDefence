package codboiiz.origummy.zombiedefence.guis;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import codboiiz.origummy.zombiedefence.Main;

public class Launcher  extends JPanel{
private static final long serialVersionUID = Main.version;
	
	public Launcher() {			
		JButton c = new JButton("Start Game");
		
		c.setBounds((int) Math.round(Main.frame.getWidth()*0.375-200), 900, 200, 50);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What the button does, for example:
			//	Main.engine();
			//	Main.startGame();
			}
		});
		
		this.setLayout(null);
		this.add(c);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//Things to paint on the panel
		g.drawString("Hello Launcher", Main.frame.getWidth() / 2 - 300, 200);
	}
}
