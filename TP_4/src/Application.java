public class Application {
    public static void main(String[] args) {
        Ingenieur p1 = new Ingenieur("ahmed", "ahmed", "ahmed@gmail.com", 7654, 10000,  "ingenieur JAVA");
        Manager p2 = new Manager("mohamed", "Mohamed", "mohamed@gmail.com", 809876, 12000, "Manager RH");
        System.out.println(p1.CalculerSalaire());
        System.out.println(p2.CalculerSalaire());
        System.out.println(p1);
        System.out.println(p2);
    }
}
