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
    private int ticks = 0;

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
	    if (isPlaying) {
		ArrayList<Byte> bytes = getOrder();
		for (byte b : bytes) {
		    int tick = 20 - bytes.indexOf(b);
		    if (tick < 0) {
			tick = 10;
		    }
		    gui.changeLight(b);
		    ticks %= tick;
		    if (ticks == 0) {
			gui.changeLight((byte) 0);
		    }
		}
		if (ticks == 0) {
		    isPlaying = false;
		}

	    } else if (!isPlaying) {
		return;
	    } else if (isGameOver) {
		isPlaying = false;
		isGameRunning = false;
		isGameOver = false;
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
		isPlaying = true;
	    } else {
		this.pressedButton = charFromListener;
	    }
	}
    }
}
