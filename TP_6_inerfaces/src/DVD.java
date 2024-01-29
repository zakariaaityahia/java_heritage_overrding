public class DVD implements Empruntable{

    private String titre;
    private String realisateur;
    private Boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Boolean getEmprunte() {
        return emprunte;
    }

    @Override
    public void emprunter() {
        if(!emprunte) {
            System.out.println("this DVD " +titre+ " its realized by " + realisateur);
            emprunte = false;
        }
        else {
            System.out.println("this dvd is already realized !!!");
        }
    }

    @Override
    public void retourener() {
        if(emprunte) {
            System.out.println("this dvd " +titre+ " its returned ");
            emprunte = true;
        } else  {
            System.out.println("this dvd " +titre+ " its not emprunted yet !!!");
        }

    }
}
