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

    private boolean isShowing, isGameOver, isGameRunning, isOn = false;
    private final Gui gui;
    private GameOrder order;
    private Character pressedButton;
    private int ticks = 0;
    private byte current = 0;

    public GameModel(Gui gui) {
	this.gui = gui;
	this.order = new GameOrder();

	Timer timer = new Timer(1000 / 10, this);
	timer.start();
    }

    public ArrayList<Byte> getOrder() {
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
	    if (isShowing) {

		ArrayList<Byte> list = getOrder();
		if (current < 0 || list.isEmpty()) {
		    return;
		}

		if (current < list.size()) {
		    if (!isOn) {
			gui.changeLight((byte) 0);
			gui.changeLight(list.get(current));
			ticks = 0;
			isOn = true;
			return;
		    } else {
			if (ticks >= 10) {
			    gui.changeLight((byte) 0);
			    isOn = false;
			    current++;
			    ticks = 0;
			    return;
			}
		    }
		} else {
		    isShowing = false;
		    current = 0;
		}
	    }
	}
    }

    public void actionPerformed(ActionEvent e) {
	ticks++;
	update();
    }

    public void pressedButton(Character charFromListener) {
	if (charFromListener.equals('a')) {
	    if (!isGameRunning && !isGameOver) {
		isGameRunning = true;
		isShowing = true;
	    }
	} else {
	    if (!isShowing && isGameRunning && !isGameOver) {
		ArrayList<Byte> list = getOrder();
		byte b = list.get(current);
		if (Byte.parseByte(String.valueOf(charFromListener)) == b) {
		    gui.changeLight(b);
		    current++;
		    if(current >= list.size()){
			isShowing = true;
			order.addOrder();
			current = 0;
		    }
		} else{
		    isGameOver = true;
		    isGameRunning = false;
		    gui.changeLight((byte)0);
		    current = 0;
		    gui.isGameOver();
		}
	    }
	}
    }
    
    public void newGame(){
	this.order = new GameOrder();
	this.isShowing = false; 
	this.isGameOver = false;
	this.isGameRunning = false;
	this.isOn = false;
	this.current = 0;
	gui.changeLight((byte)0);
	this.isGameOver = false;
    }
}
