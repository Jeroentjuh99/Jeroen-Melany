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
import models.GameModel;

/**
 *
 * @author jeroen
 */
public class Gui extends JPanel implements ActionListener {
    private Byte light = 0;
    private Tile tile = null;
    private Feedback feedback;
    private GameModel model;

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
	feedback.drawCircles(g2, light);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	repaint();
    }
    
    public void changeLight(Byte b){
	this.light = b;
    }
    
    public void isGameOver(){
	String message = "You pressed the wrong button. Try again :D";
	int a = JOptionPane.showConfirmDialog(this, message, "Game over", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	if (a == JOptionPane.ABORT || a == JOptionPane.CANCEL_OPTION || a == JOptionPane.CLOSED_OPTION){
	    System.exit(0);
	} else {
	    model.newGame();
	}
    }

    public void setGameModel(GameModel model) {
	this.model = model;
    }
}
