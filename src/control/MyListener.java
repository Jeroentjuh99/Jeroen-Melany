/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import models.GameModel;
import view.Gui;
import wiiusej.wiiusejevents.physicalevents.*;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import wiiusej.wiiusejevents.wiiuseapievents.*;

/**
 *
 * @author jeroen
 */
public class MyListener implements WiimoteListener {

    private Gui gui;
    private final GameModel model;

    public MyListener(Gui gui, GameModel model) {
	this.gui = gui;
	this.model = model;
    }

    @Override
    public void onButtonsEvent(WiimoteButtonsEvent e) {
	System.out.println(e.getButtonsJustPressed());
	if (e.isButtonUpPressed()) {
	    model.pressedButton('1');
	} else if (e.isButtonRightPressed()) {
	    model.pressedButton('2');
	} else if (e.isButtonDownPressed()) {
	    model.pressedButton('3');
	} else if (e.isButtonLeftPressed()) {
	    model.pressedButton('4');
	} else if (e.isButtonAPressed()) {
	    model.pressedButton('a');
	} else if (e.getButtonsJustPressed() == 0x12){
	    System.out.println("this");
	    model.pressedButton('c');
	} else {
	    //System.out.println("verkeerde button" + e.getButtonsJustReleased());
	}
    }

    @Override
    public void onIrEvent(IREvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onMotionSensingEvent(MotionSensingEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onExpansionEvent(ExpansionEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onStatusEvent(StatusEvent e) {

    }

    @Override
    public void onDisconnectionEvent(DisconnectionEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNunchukInsertedEvent(NunchukInsertedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onNunchukRemovedEvent(NunchukRemovedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onGuitarHeroInsertedEvent(GuitarHeroInsertedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onGuitarHeroRemovedEvent(GuitarHeroRemovedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onClassicControllerInsertedEvent(ClassicControllerInsertedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onClassicControllerRemovedEvent(ClassicControllerRemovedEvent e) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
