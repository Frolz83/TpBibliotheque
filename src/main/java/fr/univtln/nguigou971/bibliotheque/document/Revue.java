package fr.univtln.nguigou971.bibliotheque.document;

public class Revue extends Document {
    private int numero;
    public Revue(int numero, String titre){
        super(titre);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + " Revue{" +
                "numero=" + numero +
                '}';
    }
}
