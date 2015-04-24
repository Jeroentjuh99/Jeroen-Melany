package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;


public class Feedback 
{
	private Shape red; 
	private Shape blue;
	private Shape yellow;
	private Shape green;
	private double screenWidth;
	private double screenHeight;
	private double ellipseSize = 90;
	private Color[] colors = new Color[]{new Color(255, 163, 0),new Color(236,13,13,0)};
	private float[] fl = new float[] { 0.0f, 0.5f };
	
	public Feedback(Dimension dim)
	{
		screenWidth = dim.getWidth();
		screenHeight = dim.getHeight();
				
		red = new Ellipse2D.Double(screenWidth/2-ellipseSize/2, screenHeight/2-ellipseSize/2-142, ellipseSize, ellipseSize);
		blue = new Ellipse2D.Double(screenWidth/2-ellipseSize/2+142, screenHeight/2-ellipseSize/2, ellipseSize, ellipseSize);
		yellow = new Ellipse2D.Double(screenWidth/2-ellipseSize/2, screenHeight/2-ellipseSize/2+142, ellipseSize, ellipseSize);
		green = new Ellipse2D.Double(screenWidth/2-ellipseSize/2-142, screenHeight/2-ellipseSize/2, ellipseSize, ellipseSize);
	}
	
	public void drawCircles(Graphics2D g2, byte b)
	{
		switch(b)
		{
		case 1:
			g2.setPaint(new RadialGradientPaint(new Point2D.Double(screenWidth/2,screenHeight/2-142), 100f, fl, colors));
			g2.fill(red);
			break;
		case 2:
			g2.setPaint(new RadialGradientPaint(new Point2D.Double(screenWidth/2+142,screenHeight/2), 100f, fl, colors));
			g2.fill(blue);
			break;
		case 3:
			g2.setPaint(new RadialGradientPaint(new Point2D.Double(screenWidth/2,screenHeight/2+142), 100f, fl, colors));
			g2.fill(yellow);
			break;
		case 4:
			g2.setPaint(new RadialGradientPaint(new Point2D.Double(screenWidth/2-142,screenHeight/2), 100f, fl, colors));
			g2.fill(green);
			break;
		default:
			break;
		}
	}
}
