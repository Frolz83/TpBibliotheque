package fr.univtln.nguigou971.bibliotheque;

import fr.univtln.nguigou971.bibliotheque.document.Document;
import fr.univtln.nguigou971.bibliotheque.materiel.Materiel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {

    private List<Adherent> listeAdherant;
    private Map<String,Document> mapDocument;
    private List<Materiel> listeMateriel;

    public Bibliotheque(){
        this.listeAdherant = new ArrayList<>();
        this.listeMateriel = new ArrayList<>();
        this.mapDocument = new HashMap<>();
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
        getListeMateriel().add(materiel);
        return this;
    }

    public List<Adherent> getListeAdherant() {
        return listeAdherant;
    }

    public Map<String, Document> getMapDocument() {
        return mapDocument;
    }

    public List<Materiel> getListeMateriel() {
        return listeMateriel;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "listeAdherant=" + listeAdherant +
                ", mapDocument=" + mapDocument +
                ", listeMateriel=" + listeMateriel +
                '}';
    }
}
