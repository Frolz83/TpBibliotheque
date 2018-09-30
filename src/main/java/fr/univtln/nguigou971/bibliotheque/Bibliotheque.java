package fr.univtln.nguigou971.bibliotheque;

import fr.univtln.nguigou971.bibliotheque.document.Document;
import fr.univtln.nguigou971.bibliotheque.exception.IndisponibleException;
import fr.univtln.nguigou971.bibliotheque.exception.IntrouvableException;
import fr.univtln.nguigou971.bibliotheque.materiel.Materiel;

import java.util.*;

public class Bibliotheque {

    private List<Adherent> listeAdherant;
    private Map<String,Document> mapDocument;
    private Map<String,Materiel> mapMateriel;

    public Bibliotheque(){
        this.listeAdherant = new ArrayList<>();
        this.mapMateriel = new HashMap<>();
        this.mapDocument = new HashMap<>();
    }

    public Collection<Document> rechercherTitre(String mot){
        Collection<Document> collection = new ArrayList<>();
        for(String key : getMapDocument().keySet()){
            if(key.contains(mot)){
                collection.add(getMapDocument().get(key));
            }
        }
        return collection;
    }

    public void afficherFonds(){
        for (Adherent adherent: getListeAdherant()) {
            if(adherent.getNbEmprunt() >0) {
                System.out.println(adherent.getPrenom() + " " + adherent.getNom() + " à emprunté : \n");
                adherent.afficherEmprunts();
                System.out.println("\n");
            }
        }
    }

    public Bibliotheque addAdherent(Adherent adherent){
        getListeAdherant().add(adherent);
        return this;
    }

    public Bibliotheque addDocument(Document document){
        getMapDocument().put(document.getTitre(),document);
        return this;
    }

    public Bibliotheque addMateriel(Materiel materiel){
        getMapMateriel().put(materiel.getNumeroSerie(),materiel);
        return this;
    }

    public Document getDocument(String titre) throws IntrouvableException{
        if(!getMapDocument().containsKey(titre)) throw new IntrouvableException("Ce document n'existe pas");
        return getMapDocument().get(titre);
    }

    public Materiel getMateriel(String numeroSerie) throws IntrouvableException{
        if(!getMapMateriel().containsKey(numeroSerie)) throw new IntrouvableException("Ce materiel n'existe pas");
        return getMapMateriel().get(numeroSerie);
    }

    public List<Adherent> getListeAdherant() {
        return listeAdherant;
    }

    public Map<String, Document> getMapDocument() {
        return mapDocument;
    }

    public Map<String,Materiel> getMapMateriel() {
        return mapMateriel;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "listeAdherant=" + listeAdherant +
                ", mapDocument=" + mapDocument +
                ", mapMateriel=" + mapMateriel +
                '}';
    }
}
