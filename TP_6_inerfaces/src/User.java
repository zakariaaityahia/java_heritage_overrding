public class User {
    String user_name;

    public User(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void emprunterObject(Empruntable object){
        object.emprunter();
    }

}
