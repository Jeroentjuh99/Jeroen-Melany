/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author jeroen
 */
public class GameOrder {

    private ArrayList<Byte> orderlist;

    public GameOrder() {
	this.orderlist = new ArrayList<Byte>();
	int start = (int) Math.random() * 3 + 1;
	orderlist.add((byte) start);
    }

    public void addOrder() {
	byte numberLast = orderlist.get(orderlist.size());
	int number = (int) Math.random() * 3 + 1;
	if (numberLast == (byte) number) {
	    orderlist.add((byte) number);
	} else {
	    addOrder();
	}
    }

    public ArrayList getOrder() {
	return orderlist;
    }
}
