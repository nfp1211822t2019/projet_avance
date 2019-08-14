/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

/**
 *
 * @author lenovo
 */
public class NotRoomUrgente {

    private java.util.Collection<Observer> observersU = new java.util.ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observersU.add(observer);
    }

    /**
     *
     */
    public void removeObserver(Observer observer) {
        observersU.remove(observer);
    }

    /**
     *
     */
    public void notifyObservers(Notification not) {
        System.out.println("I am the Notroom urgente,  Notification received : " + not.desc + ", " + not.type);
        TransformeFactory tf = new TransformeFactory();
        java.util.Iterator iterator = observersU.iterator();
        while (iterator.hasNext()) {
            Observer o = (Observer) iterator.next();
            Abonne p = (Abonne) o;

            if (p.forma.equalsIgnoreCase("texte")) {
                String ns = "";
                ns = not.desc + ", " + not.type;
                p.update(ns);
            } else {
                Transforme t1 = tf.getForma(p.forma);
                p.update(t1.transformer_notification(not));
            }

        }


    }
}
