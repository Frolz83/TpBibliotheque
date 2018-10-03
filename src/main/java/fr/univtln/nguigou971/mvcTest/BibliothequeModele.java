package fr.univtln.nguigou971.mvcTest;

import java.util.*;

public class bibliothequeModele extends Observable {
    private Map<String,Ouvrage> livres;
    private ArrayList<Observer> listObserver = new ArrayList<Observer>();

    public bibliothequeModele(){
        this.livres = new HashMap<>();
    }

    public void deleteOuvrage(String titre){

        livres.remove(titre);
    }

    public void addOuvrage(String titre){

        livres.put(titre,new Ouvrage(titre));
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public synchronized void deleteObservers() {
        super.deleteObservers();
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
