package fr.univtln.nguigou971.bibliotheque.document;

public class Dictionnaire extends  Volume {
    private String theme;
    public Dictionnaire(String titre, String auteur,String theme) {
        super(titre, auteur);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return super.toString() + " Dictionnaire{" +
                "theme='" + theme + '\'' +
                '}';
    }
}
