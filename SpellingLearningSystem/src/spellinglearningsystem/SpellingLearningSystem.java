/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellinglearningsystem;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class SpellingLearningSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        lf.setSize(d);
        
    }
    
}
