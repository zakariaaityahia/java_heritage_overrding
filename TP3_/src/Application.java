public class Application {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Volkswagen", 250000, "jeeta", 2017);
        Moto m1 = new Moto("benelli", 60000, "Leoncina", "TRC");
        Avion a1 =  new Avion("boing 747", 4148173016.87, "Boing", 920);

        v1.emettreSon();
        v1.afficherInformations();
        System.out.println("-----------------------------");

        m1.emettreSon();
        m1.afficherInformations();
        System.out.println("-----------------------------");

        a1.emettreSon();
        a1.afficherInformations();
    }
}
