package fr.univtln.nguigou971.bibliotheque;

import fr.univtln.nguigou971.bibliotheque.document.BandeDessinnee;
import fr.univtln.nguigou971.bibliotheque.document.Livre;
import fr.univtln.nguigou971.bibliotheque.document.Revue;
import fr.univtln.nguigou971.bibliotheque.exception.IntrouvableException;
import fr.univtln.nguigou971.bibliotheque.materiel.Materiel;
import fr.univtln.nguigou971.bibliotheque.materiel.OrdinateurPortable;

public class Test {

    public static void main(String[] args)throws Exception {

        /**
         * Test 1
         */

        Bibliotheque bibliotheque = new Bibliotheque();
        Adherent ad1 = new Adherent("ETUDIANT","DUPON","Jean");
        bibliotheque.addAdherent(ad1);
        bibliotheque.addAdherent(new Adherent("ETUDIANT","DURANT","Michel"));
        bibliotheque.addAdherent(new Adherent("ENSEIGNANT","DUPRET","Gérard"));

        bibliotheque.addDocument(new Livre("Petit Bateau","Jean"))
                .addDocument(new Livre("Voyage","toto"))
                .addDocument(new Revue(25,"Science"))
                .addDocument(new Revue(3,"History"))
                .addDocument(new BandeDessinnee("Chameau bleu","tata","michou"))
                .addMateriel(new OrdinateurPortable("hp","WINDOWS","1f5z998"));

        try {
            ad1.emprunter((Empruntable) bibliotheque.getDocument("Voyage"));
            ad1.emprunter((Empruntable) bibliotheque.getMateriel("1f5z998"));
            ad1.afficherEmprunts();
           /** System.out.println("Le livre est bien emprunté");
            ad1.rendre("Voyage");
            System.out.println("Le livre est bien rendu");
            ad1.rendre("Voyage"); **/
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("fin");
        }

    }
}
