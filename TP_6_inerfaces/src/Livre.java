public class Livre implements Empruntable{
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    @Override
    public void emprunter() {
        if(!emprunte){
            System.out.println("the title is " + titre + " and the author is " + auteur);
            emprunte = true;
        }
        else {
            System.out.println("this book has already emprunted");
        }
    }

    @Override
    public void retourener() {
        if(emprunte){
            System.out.println("this book" + titre+ " by " + auteur + " its already returned");
            emprunte = false;
        }
        else {
            System.out.println("this book its not returned yet");
        }
    }
}
