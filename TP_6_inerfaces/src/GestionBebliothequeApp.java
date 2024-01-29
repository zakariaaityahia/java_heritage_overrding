public class GestionBebliothequeApp {
    public static void main(String[] args) {
        Livre livre_1 = new Livre("the valkeries", "paulo cohelo");
        Livre livre_2 = new Livre("Murder on the orient express", "Agatha Christie");

        DVD dvd_1 = new DVD("dvd_1", "Realisateur 1");
        DVD dvd_2 = new DVD("dvd_2", "Realisateur 2");

        User user = new User("zakaria");

        user.emprunterObject(dvd_1);
        user.emprunterObject(livre_2);
        System.out.println("____________________________");
        dvd_1.emprunter();
        livre_1.retourener();
    }

}
