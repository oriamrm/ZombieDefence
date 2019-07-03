package codboiiz.origummy.zombiedefence.guis;

import java.awt.*;

public class DesignedButton
{

	public DesignedButton(Graphics g, String text,Font font, int x, int y, int width, int height, int R, int G, int B, int R2, int G2, int B2, int outline) 
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Color color = new Color(R2,G2,B2);
		g2.setColor(color);
		g2.setStroke(new BasicStroke(outline));
		g2.drawRect(x, y, width, height);
		
		color = new Color(R,G,B);
		g2.setColor(color);
		g2.setStroke(new BasicStroke(0));
		g2.fillRect(x, y, width, height);
		
		//g2.setFont(font);
		//g2.drawString(str, x, y);
	}
	
	public DesignedButton(Graphics g, String text, Font font, int x, int y, int width, int height, int R, int G, int B, int R2, int G2, int B2, int outline, int curveX, int curveY) 
	{
		Graphics2D g2 = (Graphics2D)g;
		
		Color color = new Color(R2,G2,B2);
		g2.setColor(color);
		g2.setStroke(new BasicStroke(outline));
		g2.drawRoundRect(x, y, width, height, curveX, curveY);
		
		color = new Color(R,G,B);
		g2.setColor(color);
		g2.setStroke(new BasicStroke(0));
		g2.fillRoundRect(x, y, width, height, curveX, curveY);
	}
}
