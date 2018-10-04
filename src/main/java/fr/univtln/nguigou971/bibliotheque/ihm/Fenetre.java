package fr.univtln.nguigou971.bibliotheque.ihm;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {

    public Fenetre(){
        super("Bibliothèque");
        setSize(300,200);

    }

    public static void main(String[] args) {
        Fenetre f = new Fenetre();
    }
}
