package fr.univtln.nguigou971.bibliotheque.materiel;

public class Materiel {
    boolean enPanne;
    boolean emprunte;
    String numeroSerie;


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
                ", emprunte=" + emprunte +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
}
