package projet_avance;

/**
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        NotRoom n = new NotRoom();

        Patient p = new Patient(n);

        Abonne O1 = new Abonne("Ambulance1", "Urgente", "JSON");
        Abonne O2 = new Abonne("Docteur1", "Critique", "xml");
        Abonne O3 = new Abonne("Famille", "normale", "texte");
        Abonne O4 = new Abonne("Amis", "Critique", "JSON");
        Abonne O5 = new Abonne("Hopital", "Urgente", "xml");
        Abonne O6 = new Abonne("Parents", "normale", "JSON");
        Abonne O7 = new Abonne("Infirmiere", "normale", "xml");
        Abonne O8 = new Abonne("Ambulance2", "Urgente", "texte");
         Abonne O9= new Abonne("Docteur2", "Critique", "texte");



        n.addObserver(O1);
        n.addObserver(O2);
        n.addObserver(O3);
        n.addObserver(O4);
        n.addObserver(O5);
        n.addObserver(O6);
        n.addObserver(O7);
        n.addObserver(O8);
        n.addObserver(O9);





    }
}
