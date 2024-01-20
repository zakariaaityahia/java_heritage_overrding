public abstract class Employee {
    String Nom;
    String Prenom;
    String Email;
    int Telephone;
    double Salaire;

    public Employee(String nom, String prenom, String email, int telephone, double salaire) {
        Nom = nom;
        Prenom = prenom;
        Email = email;
        Telephone = telephone;
        Salaire = salaire;
    }

    public Employee() {
    }

    public abstract double CalculerSalaire();

    @Override
    public String toString() {
        return "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone=" + Telephone +
                ", Salaire=" + Salaire;
    }
}
