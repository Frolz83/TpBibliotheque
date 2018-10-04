package fr.univtln.nguigou971.mvcTest;

import java.util.*;

public class BibliothequeModele extends Observable {
    private List<Ouvrage> livres;
    private ArrayList<Observer> listObserver = new ArrayList<Observer>();
    private BibliothequeControleur bibliothequeControleur;

    public BibliothequeModele(BibliothequeControleur bibliothequeControleur){
        this.livres = new ArrayList<>();
        this.bibliothequeControleur=bibliothequeControleur;
        this.addObserver(bibliothequeControleur.getBibliothequeVue());
    }

    public void deleteOuvrage(Ouvrage ouvrage){

        livres.remove(ouvrage);
        setChanged();
        notifyObservers();
    }

    public void addOuvrage(String titre){

        livres.add(new Ouvrage(titre));
        setChanged();
        notifyObservers();
    }

    public List<Ouvrage> getLivres(){
        return this.livres;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
