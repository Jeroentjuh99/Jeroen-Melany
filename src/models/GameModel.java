/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import view.Gui;

/**
 *
 * @author jeroen
 */
public class GameModel {
    private final Gui gui;
    private GameOrder order;
    
    public GameModel(Gui gui){
	this.gui = gui;
	this.order = new GameOrder();
    }
    
    public ArrayList getOrder(){
	return order.getOrder();
    }
    
    public void addOrder(){
	order.addOrder();
    }
    
    public void newOrder(){
	this.order = new GameOrder();
    }
}
