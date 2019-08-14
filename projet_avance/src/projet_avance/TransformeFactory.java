/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projet_avance;

/**
 *
 * @author lenovo
 */
public class TransformeFactory {
    
    
    public Transforme getForma(String forma){
        if (forma.equalsIgnoreCase("xml")){return new Notification2Xml();}
        if (forma.equalsIgnoreCase("JSON")){return new Notification2JSON();}

        return null;
    }
}


