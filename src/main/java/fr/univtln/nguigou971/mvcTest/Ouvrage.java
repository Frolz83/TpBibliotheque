package fr.univtln.nguigou971.mvcTest;

public class Ouvrage {
    private String titre;

    public Ouvrage(String titre){
        this.titre=titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return getTitre();
    }
}
