public class Avion extends Vehicule{

    private String compagnie;
    private double vitesseMax;

    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("companie: " + compagnie + " vitesse max :" + vitesseMax);
    }
}
