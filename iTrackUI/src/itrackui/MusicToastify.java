/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;

/**
 *
 * @author francis.brero
 */
public class MusicToastify {
    public static void playPause() {                                                
        // TODO add your handling code here:
        System.out.println("Play/Pause");
        try {
            Robot robot = new Robot();
            
            // Du code Sordiiiiiiiide ctrl alt space
            robot.keyPress(17);
            robot.keyPress(18);
            robot.keyPress(32);
            robot.keyRelease(17);
            robot.keyRelease(18);
            robot.keyRelease(32);
        } catch (AWTException ex) {
            java.util.logging.Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void volumeUp() {                                                
        
        System.out.println("VolumeUp");
        try {
            Robot robot = new Robot();
             // Du code Sordiiiiiiiide ctrl alt up
            robot.keyPress(17);
            robot.keyPress(18);
            robot.keyPress(38);
            robot.keyRelease(17);
            robot.keyRelease(18);
            robot.keyRelease(38);
        } catch (AWTException ex) {
            java.util.logging.Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void volumeDown() {                                                
        
        System.out.println("VolumeUp");
        try {
            Robot robot = new Robot();
             // Du code Sordiiiiiiiide ctrl alt down
            robot.keyPress(17);
            robot.keyPress(18);
            robot.keyPress(40);
            robot.keyRelease(17);
            robot.keyRelease(18);
            robot.keyRelease(40);
        } catch (AWTException ex) {
            java.util.logging.Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
