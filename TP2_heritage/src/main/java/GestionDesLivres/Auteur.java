package GestionDesLivres;

public class Auteur extends Personne{
    private int numAuteur;


    public Auteur(int numAuteur, String Nom, String Prenom, String email, int tel, int age) {
            super(Nom, Prenom, email, tel, age);
            this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" + super.toString() +
                "numAuteur=" + numAuteur +
                '}';
    }
}
