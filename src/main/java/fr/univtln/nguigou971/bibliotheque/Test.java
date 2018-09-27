package fr.univtln.nguigou971.bibliotheque;

import fr.univtln.nguigou971.bibliotheque.document.BandeDessinnee;
import fr.univtln.nguigou971.bibliotheque.document.Livre;
import fr.univtln.nguigou971.bibliotheque.document.Revue;

public class Test {

    public static void main(String[] args) {

        /**
         * Test 1
         */

        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.addAdherent(new Adherent("ETUDIANT","DUPON","Jean"));
        bibliotheque.addAdherent(new Adherent("ETUDIANT","DURANT","Michel"));
        bibliotheque.addAdherent(new Adherent("ENSEIGNANT","DUPRET","Gérard"));

        bibliotheque.addDocument(new Livre("Petit Bateau","Jean"))
                .addDocument(new Livre("Voyage","toto"))
                .addDocument(new Revue(25,"Science"))
                .addDocument(new Revue(3,"History"))
                .addDocument(new BandeDessinnee("Chameau bleu","tata","michou"));

        System.out.println(bibliotheque.toString());
        System.out.println("test");
    }
}
