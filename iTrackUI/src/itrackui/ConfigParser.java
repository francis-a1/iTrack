/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author francis.brero
 */
public class ConfigParser {
    
    static public Action[] getActions(){
        Action[] actions = new Action[10];
        return actions;
    }
    static public HashMap<String, String> getActions (String json) throws Throwable{

        HashMap<String, String> result = new HashMap<String, String>();

        JSONParser parser = new JSONParser();

        Object obj = null;

        obj = parser.parse(json);

        JSONObject object = (JSONObject) obj;

        JSONArray Server = (JSONArray) object.get("Actions");

        if (Server != null) {

            // iterates over each bucket group and parses it
            Iterator<JSONObject> iterator = Server.iterator();
            while (iterator.hasNext()) {
                try {
                    addInfoToHashMap(iterator.next().toJSONString(), result);
                } catch (Exception ex) {
                }
            }

        }

        JSONArray Network = (JSONArray) object.get("Actions");

        if (Network != null) {

            // iterates over each bucket group and parses it
            Iterator<JSONObject> iteratorN = Network.iterator();
            while (iteratorN.hasNext()) {
                try {
                    addInfoToHashMap(iteratorN.next().toJSONString(), result);
                } catch (Exception ex) {
                }
            }

        }

        JSONArray Parent = (JSONArray) object.get("Parent");

        if (Parent != null) {

            // iterates over each bucket group and parses it
            Iterator<JSONObject> iteratorN = Parent.iterator();
            while (iteratorN.hasNext()) {
                try {
                    addInfoToHashMap(iteratorN.next().toJSONString(), result);
                } catch (Exception ex) {
                }
            }

        }

        return result;
    }    
    
     private static void addInfoToHashMap(String json, HashMap<String, String> configTable) throws Throwable{
        JSONParser parser = new JSONParser();

        Object obj = null;
        obj = parser.parse(json);

        JSONObject object = (JSONObject) obj;

        Set keys = object.keySet();

        for (Iterator iter = keys.iterator(); iter.hasNext(); ) {

            String key = (String) iter.next();

            String value = object.get(key).toString();

            configTable.put(key, value);
        }

    }
}