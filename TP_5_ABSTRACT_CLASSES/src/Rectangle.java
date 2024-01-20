public class Rectangle extends Figure{
    double Longeur;
    double Largeur;

    public Rectangle(String nom, double longeur, double largeur) {
        super(nom);
        this.Longeur = longeur;
        this.Largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return Longeur * Largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (Longeur * Largeur) * 2;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Longeur: " + Longeur +
                ", Largeur: " + Largeur +
                ", Nom: " + Nom ;
    }
}
