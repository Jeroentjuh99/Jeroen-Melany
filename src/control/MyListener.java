/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import wiiusej.wiiusejevents.physicalevents.*;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import wiiusej.wiiusejevents.wiiuseapievents.*;

/**
 *
 * @author jeroen
 */
public class MyListener implements WiimoteListener {

    @Override
    public void onButtonsEvent(WiimoteButtonsEvent e) {
	System.out.println(e);
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
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
