/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author jeroen
 */
public class Tile {

    private Point pos;
    private boolean lightBool;
    private Image tile;

    public Tile(String path, Point pos) {
	this.pos = pos;
	this.lightBool = false;
	this.tile = new ImageIcon(path).getImage();
    }

    public void changeLight() {
	lightBool = !lightBool;
    }

    public void draw(Graphics2D g2) {
	g2.drawImage(tile, pos.x, pos.y, null);
    }
}
