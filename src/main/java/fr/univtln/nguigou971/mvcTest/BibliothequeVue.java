package fr.univtln.nguigou971.mvcTest;

import fr.univtln.nguigou971.bibliotheque.Bibliotheque;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

public class BibliothequeVue extends JFrame implements Observer{


    private static final JComboBox<Ouvrage> ouvrages = new JComboBox<>();
    private static final JButton boutonSupprimer = new JButton("Supprimer");

    private static final JTextField textTitre = new JTextField();
    private static final JButton boutonCreer = new JButton("Ajouter");

    private BibliothequeControleur bibliothequeControleur;

    private boolean ajouter;
    private boolean supprimer;



    public BibliothequeVue(){
        super("Bibliotheque");
        this.bibliothequeControleur = new BibliothequeControleur(this);
        setSize(300,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane =getContentPane();
        JPanel panelGeneral = new JPanel();
        panelGeneral.setLayout(new GridLayout(1,2));

        JPanel panelCreation = new JPanel();
        panelCreation.setLayout(new GridLayout(2,1));
        panelCreation.add(textTitre);
        panelCreation.add(boutonCreer);
        panelCreation.setBorder(BorderFactory.createTitledBorder("Création"));

        boutonCreer.setEnabled(false);
        boutonCreer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bibliothequeControleur.ajouterOuvrage(textTitre.getText());
            }
        });

        textTitre.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(textTitre.getText().equals(""))
                    boutonCreer.setEnabled(false);
                else
                    boutonCreer.setEnabled(true);
            }
        });

        JPanel panelSuppression = new JPanel();
        panelSuppression.setLayout(new GridLayout(2,1));
        panelSuppression.add(ouvrages);
        panelSuppression.add(boutonSupprimer);

        boutonSupprimer.setEnabled(false);

        ouvrages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boutonSupprimer.setEnabled(ouvrages.getSelectedIndex() ==0);
            }
        });
        boutonSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bibliothequeControleur.supprimerOuvrage((Ouvrage) ouvrages.getSelectedItem());
            }
        });

        panelSuppression.setBorder(BorderFactory.createTitledBorder("Suppression"));

        contentPane.add(panelGeneral);

        panelGeneral.add(panelSuppression);
        panelGeneral.add(panelCreation);

        setVisible(true);

    }


    public static void main(String[] args) {
        BibliothequeVue bibliothequeVue = new BibliothequeVue();
    }

    @Override
    public void update(Observable o, Object arg) {
        ouvrages.removeAllItems();
        for (Ouvrage ouvrage:bibliothequeControleur.getBibliothequeModele().getLivres()) {
            ouvrages.addItem(ouvrage);

        }
    }
}
