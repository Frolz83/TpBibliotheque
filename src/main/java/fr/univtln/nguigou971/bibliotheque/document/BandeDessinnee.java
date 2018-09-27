package fr.univtln.nguigou971.bibliotheque.document;

public class BandeDessinnee extends Volume {

    private String dessinateur;
    public BandeDessinnee(String titre, String auteur,String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    @Override
    public String toString() {
        return super.toString() + " BandeDessinnee{" +
                "dessinateur='" + dessinateur + '\'' +
                '}';
    }
}
