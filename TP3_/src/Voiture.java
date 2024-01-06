public class Voiture extends Vehicule{
    private String model;
    private int anne;

    public Voiture(String nom, double prix) {
        super(nom, prix);
    }

    public Voiture(String nom, double prix, String model, int anne) {
        super(nom, prix);
        this.model = model;
        this.anne = anne;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }
}
