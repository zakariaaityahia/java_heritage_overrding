package GestionDesLivres;

public class Application {
    public static void main(String[] args) {

        Adherent a1 = new Adherent("ahmed", "alami", "ahmed@gmail.com", 1684617, 28, 01);
        Auteur a2 = new Auteur(1, "Merouane", "adam", "merouane@gmail.com", 0622554411, 30);
        Livre a3 = new Livre(1452, "hhy", a2);


        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());


    }
}
