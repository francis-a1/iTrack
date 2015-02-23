/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

import java.awt.BorderLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.List;


/**
 *
 * @author francis.brero
 */
public class ITrackModels {

    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
        
         // Load Actions list
        ArrayList<Action> actions = new ArrayList<Action>();
        Action.setActionsDefault(actions);
                
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        
        iTrackUI p = new iTrackUI();        
        p.iTracUIsetI(0);
        p.iTracUIsetA(actions);
        p.iTrackUIrefresh();
        
        
        
        p.add(new JLabel("A Panel"));
        f.add(p, BorderLayout.CENTER);

        f.pack();
        f.setTitle("itrackUI App");
        f.setVisible(true);
        
    }
    
}
