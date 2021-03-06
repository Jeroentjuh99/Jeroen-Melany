/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;

/**
 *
 * @author jeroen
 */
public class Tile {

    private Point pos;
    private Image tile;

    public Tile(String path, Point pos) {
	this.pos = pos;
	this.tile = new ImageIcon(path).getImage();
    }
    
    private AffineTransform setTransform(){
	AffineTransform transformer = new AffineTransform();
	transformer.translate(pos.getX(), pos.getY());
	transformer.scale(1,1);
	transformer.rotate(Math.toRadians(-45), tile.getWidth(null)/2, tile.getHeight(null)/2);
	return transformer;
    }

    public void draw(Graphics2D g2) {
	AffineTransform tx = setTransform();
	g2.drawImage(tile, tx, null);
    }
}
