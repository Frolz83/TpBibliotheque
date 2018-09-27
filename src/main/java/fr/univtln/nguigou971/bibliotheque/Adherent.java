package fr.univtln.nguigou971.bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Adherent {

    public enum Statut{
        ETUDIANT,ENSEIGNANT
    }
    private Statut statut;
    private String nom;
    private String prenom;
    private final static  int MAX_EMPRUNT = 5;
    private int nbEmprunt;
    private List<Empruntable> emprunts;

    public Adherent(String statut, String nom, String prenom){
        this.statut = Statut.valueOf(statut);
        this.nom = nom;
        this.prenom = prenom;
        this.emprunts = new ArrayList<>();
    }

    public Adherent emprunter(Empruntable e){
        if(e.isDisponible() && nbEmprunt<MAX_EMPRUNT){
            emprunts.add(e);
            ++nbEmprunt;
            e.setDisponibilite(false);
        }
        return this;
    }

    public Adherent rendre(Empruntable e){
        if(nbEmprunt<1 || !emprunts.contains(e))
            return this;
        else{
            emprunts.remove(e);
            nbEmprunt --;
            e.setDisponibilite(true);
            return this;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "statut=" + statut +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbEmprunt=" + nbEmprunt +
                ", emprunts=" + emprunts +
                '}';
    }
}
