public class Ingenieur extends Employee {
    String Specialite;

    public Ingenieur(String nom, String prenom, String email, int telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        Specialite = specialite;
    }

    @Override
    public double CalculerSalaire() {
        return Salaire * 15;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Specialite='" + Specialite + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone=" + Telephone +
                ", Salaire=" + Salaire ;
    }
}



