package codboiiz.origummy.zombiedefence.guis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.Timer;

import codboiiz.origummy.zombiedefence.Main;

public class Display extends JPanel implements ActionListener{
	private static final long serialVersionUID = Main.version;
	
	final static int fps = 100;
//	public static Map map;
	Timer timer = new Timer(Math.round(1000/fps), this);
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(getFrame(), 1, 1, null);
		
		timer.start();
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public BufferedImage getFrame() {
		BufferedImage bufImg = new BufferedImage(Main.frame.getWidth(), Main.frame.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bufImg.getGraphics();
		
		//Background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, Main.frame.getWidth(), Main.frame.getHeight());
		
				
		//Entities
		EntityManager.entities.forEach((uuid, entity) -> {
			g.setColor(entity.color);
			if (entity instanceof PolyEntity) {
			//	g.fillRect(Math.round(Math.round(((PolyEntity) entity).getPoly().xcords[0])), Math.round(Math.round(((PolyEntity) entity).getPoly().ycords[0])), 50, 50);
				g.fillPolygon(((PolyEntity)entity).getPoly().getAsPolygon());
			} else if(entity instanceof Lob) {
		//		g.drawOval(Math.round(Math.round(entity.getX())), Math.round(Math.round(entity.getY())), entity.getSizeX(), entity.getSizeY());	
			}
		});
		
		return bufImg;
	}
}
