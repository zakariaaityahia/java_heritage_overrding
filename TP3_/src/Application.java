import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Volkswagen", 250000, "jeeta", "2017");
        Moto m1 = new Moto("benelli", 60000, "Leoncina", "TRC");
        Avion a1 =  new Avion("boing 747", 4148173016.87, "Boing", 920);

        Voiture voitures[] =new Voiture[3];
        voitures[0] = new Voiture("ford", 666543, "kls", "2022");
        voitures[1] = new Voiture("ford 1", 666543, "sas", "2013");
        voitures[2] = new Voiture("ford 3", 666543, "dffd", "2012");

        for(Voiture v :voitures) {
            System.out.println(v);
        }
 

        System.out.println("++++++++++++++++++++++++++++++");
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
