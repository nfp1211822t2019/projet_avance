/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_avance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class Patient {

    NotRoom n;
    private JFrame f;
    private JButton b;
    private JTextField t;
    private ButtonGroup g;
    private JRadioButton c1, c2, c3;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JLabel l1;
    private JLabel l2;

    public Patient(final NotRoom n) {
        this.n = n;

        f = new JFrame();
        f.setTitle("Projet Programmation avancée");
        l1 = new JLabel("Notification: ");
        t = new JTextField(50);

        f.setPreferredSize(new Dimension(750, 170));


        l2 = new JLabel("Cas: ");
        c1 = new JRadioButton("Normale", true);
        c2 = new JRadioButton("Critique", false);
        c3 = new JRadioButton("Urgente", false);
        g = new ButtonGroup();
        g.add(c1);
        g.add(c2);
        g.add(c3);


        b = new JButton("Envoyer");

        b.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        {
                            if (t.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "donner la notification");
                            } else {
                                String s = t.getText();
                                String type = "";
                                if (c1.isSelected()) {
                                    type = "Normale";
                                } else if (c2.isSelected()) {
                                    type = "Critique";
                                } else if (c3.isSelected()) {
                                    type = "Urgente";
                                }

                                Notification not = new Notification(s, type);
                                n.receiveNotification(not);

                            }
                        }
                    }
                });

        p1 = new JPanel();
        p1.add(l1);
        p1.add(t);

        p2 = new JPanel();
        p2.add(l2);
        p2.add(c1);
        p2.add(c2);
        p2.add(c3);

        p3 = new JPanel();
        p3.add(b);

        p4 = new JPanel();
        p4.add(p1);
        p4.add(p2);
        p4.add(p3);

        f.add(p4);


        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
