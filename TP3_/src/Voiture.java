public class Voiture extends Vehicule{
    private String model;
    private String year;

    public Voiture(String nom, double prix, String model, String year) {
        super(nom, prix);
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Model: " + model + " | year :" + year);
    }
}
