public abstract class Figure {
    protected String Nom;
    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public Figure(String nom) {
        Nom = nom;
    }

    public String afficherDetails() {
        return "Le nom " + Nom + "Aire " + calculerAire() + "Perimetre " + calculerPerimetre();
    }

    @Override
    public String toString() {
        return "Figure " +
                " Nom= " + Nom;
    }
}
