/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

/**
 *
 * @author lenovo
 */
public class Abonne implements Observer {

    String s;
    String nom;
    String forma;

    public Abonne(String nom, String s, String forma) {

        this.nom = nom;
        this.s = s;
        this.forma = forma;
    }

    public void update(String mess) {
        System.out.println("je suis " + this.nom + " , notification recu : \n " + mess);
    }
}
