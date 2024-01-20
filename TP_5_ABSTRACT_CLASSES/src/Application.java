public class Application {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle 1", 2);
        Rectangle rectangle = new Rectangle("Rectangle 1",3, 3);


        System.out.println(cercle);
        System.out.println(cercle.afficherDetails());
        System.out.println(rectangle);
        System.out.println(rectangle.afficherDetails());

    }
}
