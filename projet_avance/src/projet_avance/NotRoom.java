/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

/**
 *
 * @author lenovo
 */
public class NotRoom {

    private NotRoomNormal n;
    private NotRoomCritique c;
    private NotRoomUrgente u;
    private java.util.Collection<Observer> observers = new java.util.ArrayList<Observer>();

    public NotRoom() {
        n = new NotRoomNormal();
        c = new NotRoomCritique();
        u = new NotRoomUrgente();

    }

    public void addObserver(Abonne o) {
        observers.add(o);
        if (o.s.equalsIgnoreCase("Urgente")) {
            u.addObserver(o);
        }

        if (o.s.equalsIgnoreCase("Critique")) {
            c.addObserver(o);
        }

        if (o.s.equalsIgnoreCase("Normale")) {
            n.addObserver(o);
        }

    }

    public void removeObserver(Abonne o) {
        observers.remove(o);
        if (o.s.equalsIgnoreCase("Urgente")) {
            u.removeObserver(o);
        }

        if (o.s.equalsIgnoreCase("Critique")) {
            c.removeObserver(o);
        }

        if (o.s.equalsIgnoreCase("Normale")) {
            n.removeObserver(o);
        }

    }

    public void notifyObservers(Notification nt) {
        if (nt.type.equalsIgnoreCase("Normale")) {
            n.notifyObservers(nt);
        }
        if (nt.type.equalsIgnoreCase("Critique")) {
            n.notifyObservers(nt);
            c.notifyObservers(nt);
        }
        if (nt.type.equalsIgnoreCase("Urgente")) {
            n.notifyObservers(nt);
            c.notifyObservers(nt);
            u.notifyObservers(nt);
        }

    }

    void receiveNotification(Notification not) {
        System.out.println("I am the Notroom classique, Notification received : " + not.desc + ", " + not.type);
        notifyObservers(not);
    }
}
