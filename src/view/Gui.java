/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author jeroen
 */
public class Gui extends JPanel implements ActionListener {

    private Tile tile = null;
    private Feedback feedback;

    public Gui(Dimension dim) {
	this.setSize(dim);
	Point point = new Point((int) (dim.getWidth() / 2) - 200, (int) (dim.getHeight() / 2) - 200);
	tile = new Tile("src/view/images/Simon.png", point);
	feedback =  new Feedback(dim);
	Timer timer = new Timer(1000 / 30, this);
	timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	tile.draw(g2);
	//feedback.drawCircles(g2, (byte) 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	repaint();
    }
}
