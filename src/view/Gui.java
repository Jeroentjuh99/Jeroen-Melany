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
    private Tile[] tiles = {null, null, null, null, null};
    
    public Gui(Dimension dim) {
	this.setSize(dim);
	Point point = new Point((int)(dim.getWidth()/2)-200, (int)(dim.getHeight()/2)-200);
	makeSimon(point);	
	Timer timer = new Timer(1000 / 30, this);
	timer.start();
    }
    
    private void makeSimon(Point point){
	tiles[0] = new Tile("src/view/images/base.png", point);
	tiles[1] = new Tile("src/view/images/red.png", point);
	tiles[2] = new Tile("src/view/images/blue.png", point);
	tiles[3] = new Tile("src/view/images/yellow.png", point);
	tiles[4] = new Tile("src/view/images/cyan.png", point);
    }

    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	
	for (Tile tile : tiles) {
	    tile.draw(g2);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	repaint();
    }
}
