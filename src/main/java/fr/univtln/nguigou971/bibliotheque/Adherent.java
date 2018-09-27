package fr.univtln.nguigou971.bibliotheque;

import fr.univtln.nguigou971.bibliotheque.exception.EmpruntMaxException;
import fr.univtln.nguigou971.bibliotheque.exception.IndisponibleException;
import fr.univtln.nguigou971.bibliotheque.exception.NonEmprunteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adherent {

    public enum Statut{
        ETUDIANT,ENSEIGNANT
    }
    private Statut statut;
    private String nom;
    private String prenom;
    private final static  int MAX_EMPRUNT = 5;
    private int nbEmprunt;
    private Map<String,Empruntable> emprunts;

    public Adherent(String statut, String nom, String prenom){
        this.statut = Statut.valueOf(statut);
        this.nom = nom;
        this.prenom = prenom;
        this.emprunts = new HashMap<>();
    }

    public void afficherEmprunts(){
        for(String key : emprunts.keySet()){
            emprunts.get(key);
            System.out.println(key + "->" + emprunts.get(key).toString());
        }
    }

    public Adherent emprunter(Empruntable e)throws IndisponibleException, EmpruntMaxException{
        if(!e.isDisponible())throw new IndisponibleException("Cet objet n'est pas disponible");
        if(nbEmprunt == MAX_EMPRUNT) throw new EmpruntMaxException("Cet utilisateur est à sa limite d'emprunt");
        if(e.isDisponible() && nbEmprunt<MAX_EMPRUNT){
            emprunts.put(e.getIdendificateur(),e);
            ++nbEmprunt;
            e.setDisponibilite(false);
        }
        return this;
    }

    public Adherent rendre(String identificateur) throws NonEmprunteException{
        if(!emprunts.containsKey(identificateur))throw new NonEmprunteException("Cet objet n'est pas emprunté");
        if(nbEmprunt<1 || !emprunts.containsKey(identificateur))
            return this;
        else{
            emprunts.get(identificateur).setDisponibilite(true);
            emprunts.remove(identificateur);
            nbEmprunt --;
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
