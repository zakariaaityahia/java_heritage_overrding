public class Manager extends Employee{
    String Service;

    public Manager(String nom, String prenom, String email, int telephone, double salaire, String Service) {
        super(nom, prenom, email, telephone, salaire);
        this.Service = Service;
    }

    @Override
    public double CalculerSalaire() {
        return Salaire * 20;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Service='" + Service + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone=" + Telephone +
                ", Salaire=" + Salaire ;
    }
}
