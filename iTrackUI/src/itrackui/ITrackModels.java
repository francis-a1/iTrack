/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author francis.brero
 */
public class ITrackModels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());

        JPanel p = new iTrackUI();
        
        p.add(new JLabel("A Panel"));
        f.add(p, BorderLayout.CENTER);

        f.pack();
        f.setTitle("itrackUI App");
        f.setVisible(true);
        
    }
    
}
