package fr.univtln.nguigou971.bibliotheque.ihm;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Composant extends Fenetre {
    public Composant(){
        super();
        Container contentPane =getContentPane();


        JPanel panelGeneralCreation = new JPanel();
        panelGeneralCreation.setLayout(new GridLayout(2,1));

        JPanel entreeText = new JPanel();
        entreeText.setLayout(new GridLayout(2,2));
        Border border = BorderFactory.createTitledBorder("Création");
        panelGeneralCreation.setBorder(border);

        final JTextField textFieldTitre = new JTextField();
        final JTextField textFieldAuteur = new JTextField();

        JLabel labelTitre = new JLabel("Titre");
        JLabel labelAuteur = new JLabel("Auteur");

        JButton boutonCreation = new JButton("Créer");
        JButton boutonAnnulation = new JButton("Annuler");

        entreeText.add(labelTitre);
        entreeText.add(labelAuteur);
        entreeText.add(textFieldTitre);
        entreeText.add(textFieldAuteur);
        panelGeneralCreation.add(entreeText);

        JPanel zoneBouton = new JPanel();
        zoneBouton.setLayout(new GridLayout(1,2));
        zoneBouton.add(boutonCreation);
        zoneBouton.add(boutonAnnulation);
        panelGeneralCreation.add(zoneBouton);

        contentPane.add(panelGeneralCreation);


        JPanel zoneAffichage = new JPanel();

        boutonCreation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nouveau livre créé : " + textFieldAuteur.getText() + " " + textFieldTitre.getText());
            }
        });

        setVisible(true);
        //pack();
    }

    public static void main(String[] args) {
        Composant composant = new Composant();

    }
}
