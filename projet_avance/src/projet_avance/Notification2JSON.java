/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

import com.google.gson.Gson;

/**
 *
 * @author lenovo
 */
public class Notification2JSON implements Transforme {

    public String transformer_notification(Notification n) {
        Gson json = new Gson();
        String js = json.toJson(n);
        return js;
    }
}
