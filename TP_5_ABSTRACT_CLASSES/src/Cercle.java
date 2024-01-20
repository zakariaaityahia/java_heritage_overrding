import java.util.Random;

public class Cercle extends Figure{
    double Rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        Rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(Rayon, 2);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * Rayon;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Rayon= " + Rayon +
                ", Nom= " + Nom;
    }
}
