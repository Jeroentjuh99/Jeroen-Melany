
import control.WiiMote;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import models.GameModel;
import view.Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jeroen
 */
public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame("Simon the Game");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

	Gui gui = new Gui(dim);
	GameModel model = new GameModel(gui);
	gui.setGameModel(model);
	WiiMote wMote = new WiiMote(gui, model);

	frame.setContentPane(gui);
	frame.setSize(dim);
	frame.setResizable(false);
	frame.setVisible(true);
    }
}
