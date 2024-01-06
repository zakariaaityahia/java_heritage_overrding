package GestionDesLivres;

public class Personne {
    private String Nom;
    private String Prenom;
    private String email;
    private int tel;
    private int age;


    public Personne() {
    }

    public Personne(String nom, String prenom, String email, int tel, int age) {
        Nom = nom;
        Prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                ", age=" + age +
                '}';
    }
}
