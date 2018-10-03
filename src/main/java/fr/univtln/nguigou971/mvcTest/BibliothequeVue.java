package fr.univtln.nguigou971.mvcTest;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class bibliothequeVue extends JFrame implements Observer  {

    private static final JComboBox<Ouvrage> ouvrages = new JComboBox<>();
    private static final JButton boutonSupprimer = new JButton();

    private static final JTextField textTitre = new JTextField();
    private static final JButton boutonCreer = new JButton();


    public bibliothequeVue(){
        super("Bibliotheque");
        setSize(300,200);

        Container contentPane =getContentPane();
        JPanel panelGeneral = new JPanel();
        panelGeneral.setLayout(new GridLayout(1,2));

        JPanel panelCreation = new JPanel();
        panelCreation.setLayout(new GridLayout(2,1));
        panelCreation.add(textTitre);
        panelCreation.add(boutonCreer);

        JPanel panelSuppression = new JPanel();
        panelSuppression.setLayout(new GridLayout(2,1));
        panelSuppression.add(ouvrages);
        panelSuppression.add(boutonSupprimer);

        setVisible(true);
    }
    @Override
    public void update(Observable o, Object arg) {

    }
}
