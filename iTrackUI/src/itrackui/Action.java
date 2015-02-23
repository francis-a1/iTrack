/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;

import java.util.ArrayList;

/**
 *
 * @author francis.brero
 */
public class Action {
    public int Index;
    public String Name;
    public String Desc;
    public String APIActivateCall;
    public String APICancelCall;            

    // Constructors

    public Action() {}
    
    
    // Setters
    
    public Action(int index, String name, String desc, String APIActivateCall, String APICancelCall){
        this.Index = index;
        this.Name = name;
        this.Desc = desc;
        this.APIActivateCall = APIActivateCall;
        this.APICancelCall = APICancelCall;
        Logger.log("Action "+name+" loaded");
    }
    
    public Action(int index, String name, String desc){
        this.Index = index;
        this.Name = name;
        this.Desc = desc;
        Logger.log("Action "+name+" loaded");
    }
    
    public static void setActionsDefault (ArrayList<Action> actions) {
        actions.add(new Action(0,"Music", "Play,Pause your music"));
        actions.add(new Action(1,"Logger", "will log to the console a bunch of stuff"));
        actions.add(new Action(2,"open a browser","bla"));        
    }
    
    // API
    public static Action loadActionI(ArrayList<Action> actions, int index){
        Action action = new Action();
        action = actions.get(index);
        return action;
    }
}