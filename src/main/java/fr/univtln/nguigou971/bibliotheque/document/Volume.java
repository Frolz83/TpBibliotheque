package fr.univtln.nguigou971.bibliotheque.document;

public class Volume extends Document {
    private  String auteur;

    public Volume(String titre,String auteur){
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() + " Volume{" +
                "auteur='" + auteur + '\'' +
                '}';
    }
}
