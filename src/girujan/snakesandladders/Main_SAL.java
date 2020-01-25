/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girujan.snakesandladders;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author girujan
 */
public class Main_SAL {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        SAL_Frame salf = new SAL_Frame();
        salf.setVisible(true);
        salf.setSize(416, 370);
        salf.setLocation(300,150);
        DiceRoll dr = new DiceRoll();
        dr.setLocation(salf.getX()+420, salf.getY());
        dr.setVisible(true);
    }
    
}
