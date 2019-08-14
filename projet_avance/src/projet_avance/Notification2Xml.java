/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

import com.thoughtworks.xstream.XStream;
/**
 *
 * @author lenovo
 */
public class Notification2Xml implements Transforme {

    public String transformer_notification(Notification n) {
       XStream  xstream = new XStream();
       
         return xstream.toXML(n);
     
    }
}
