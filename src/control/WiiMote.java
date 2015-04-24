/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.Gui;
import wiiusej.*;

public class WiiMote {
    private Wiimote[] wiimotes;
    private Gui gui;

    public WiiMote(Gui gui) {
	this.gui = gui;
	wiimotes = WiiUseApiManager.getWiimotes(4, true);
	for(byte i = 0; i < wiimotes.length; i++){
	    Wiimote wiiMote = wiimotes[i];
	    wiiMote.addWiiMoteEventListeners(new MyListener(gui));
	}
    }
}
