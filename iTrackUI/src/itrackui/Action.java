/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

import static itrackui.MusicToastify.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author francis.brero
 */
public class Action {
    public int Index;
    public String Name;
    public String Desc;
    public Method APIActivateCall;
    public Method APICancelCall;            

    // Constructors

    public Action() {}
    
    
    // Setters
    
    public Action(int _index, String _name, String _desc, Method _APIActivateCall, Method _APICancelCall){
        this.Index = _index;
        this.Name = _name;
        this.Desc = _desc;
        this.APIActivateCall = _APIActivateCall;
        this.APICancelCall = _APICancelCall;
        Logger.log("Action "+_name+" loaded");
    }
    
    public Action(int _index, String _name, String _desc){
        this.Index = _index;
        this.Name = _name;
        this.Desc = _desc;
        Logger.log("Action "+_name+" loaded");
    }
    
    public void actionActivateSet(String className) throws Throwable{
        MusicToastify music = new MusicToastify();        
        this.APIActivateCall = music.getClass().getDeclaredMethod(className);        
    }
    
    public void actionCancelSet(String className) throws Throwable{
        MusicToastify music = new MusicToastify();        
        this.APICancelCall = music.getClass().getDeclaredMethod(className);        
    }
    
    
    public static void setActionsDefault (ArrayList<Action> actions) throws Throwable {        
        Action action0 = new Action(0,"Music", "Play,Pause your music");
        action0.actionActivateSet("playPause");
        action0.actionCancelSet("playPause");
        actions.add(action0);
        Action action1 = new Action(1,"Music", "Pump the volume");
        action1.actionActivateSet("volumeUp");
        action1.actionCancelSet("volumeDown");
        actions.add(action1);       
        actions.add(new Action(2,"open a browser","bla"));   
        
    }
    
    // API
    public static Action loadActionI(ArrayList<Action> actions, int index){
        Action action = new Action();
        action = actions.get(index);
        return action;
    }
}