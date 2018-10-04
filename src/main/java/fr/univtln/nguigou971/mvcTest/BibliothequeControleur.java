package fr.univtln.nguigou971.mvcTest;

import fr.univtln.nguigou971.bibliotheque.Bibliotheque;

public class BibliothequeControleur {

    private BibliothequeVue bibliothequeVue;
    private BibliothequeModele bibliothequeModele;
    public BibliothequeControleur(BibliothequeVue bibliothequeVue){
        this.bibliothequeVue=bibliothequeVue;
        this.bibliothequeModele = new BibliothequeModele(this);
    }

    public BibliothequeVue getBibliothequeVue() {
        return bibliothequeVue;
    }

    public BibliothequeModele getBibliothequeModele() {
        return bibliothequeModele;
    }

    public void ajouterOuvrage(String titre){
        bibliothequeModele.addOuvrage(titre);
    }

    public void supprimerOuvrage(Ouvrage ouvrage){
        bibliothequeModele.deleteOuvrage(ouvrage);
    }
}
