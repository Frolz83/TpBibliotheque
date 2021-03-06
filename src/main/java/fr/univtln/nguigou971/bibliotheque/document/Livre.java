package fr.univtln.nguigou971.bibliotheque.document;

import fr.univtln.nguigou971.bibliotheque.Empruntable;

public class Livre extends Volume implements Empruntable {
    private Boolean emprunte;
    public Livre(String titre, String auteur) {
        super(titre, auteur);
        emprunte = false;
    }

    @Override
    public boolean isDisponible() {
        return !emprunte;
    }

    @Override
    public void setDisponibilite(boolean disponibilite) {
        setEmprunte(!disponibilite);
    }

    @Override
    public String getIdendificateur() {
        return getTitre();
    }

    @Override
    public String toString() {
        return super.toString() + "Ouvrage{" +
                "emprunte=" + emprunte +
                '}';
    }

    public void setEmprunte(Boolean emprunte) {
        this.emprunte = emprunte;
    }
}
