/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import view.Gui;

/**
 *
 * @author jeroen
 */
public class GameModel implements ActionListener {

    private boolean isPlaying, isGameOver, isGameRunning = false;
    private final Gui gui;
    private GameOrder order;
    private Character pressedButton;

    public GameModel(Gui gui) {
	this.gui = gui;
	this.order = new GameOrder();

	Timer timer = new Timer(1000 / 10, this);
	timer.start();
    }

    public ArrayList getOrder() {
	return order.getOrder();
    }

    public void addOrder() {
	order.addOrder();
    }

    public void newOrder() {
	this.order = new GameOrder();
    }

    public void update() {
	if (isGameRunning) {
	    if(isPlaying){
		
	    }
	}
    }

    public void actionPerformed(ActionEvent e) {
	update();
    }

    public void pressedButton(Character charFromListener) {
	if (charFromListener.equals('a')) {
	    if (!isGameRunning && !isGameOver) {
		isGameRunning = true;
	    }
	    else{
		this.pressedButton = charFromListener;
	    }
	}
    }
}
