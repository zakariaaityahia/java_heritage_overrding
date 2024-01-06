package GestionDesLivres;

public class Adherent extends Personne{

    private int numAdherent;


    public Adherent(String nom, String prenom, String email, int tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    public int getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adherent{" + super.toString() +
                "numAdherent=" + numAdherent +
                '}';
    }
}
