package fr.univtln.nguigou971.bibliotheque.materiel;

public class Materiel {
    boolean enPanne;
    boolean emprunte;

    public boolean isEnPanne() {
        return enPanne;
    }

    public void setEnPanne(boolean enPanne) {
        this.enPanne = enPanne;
    }

    public void setEmprunte(boolean emprunte) {
        this.emprunte = emprunte;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "enPanne=" + enPanne +
                '}';
    }

}
