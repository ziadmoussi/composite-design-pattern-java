public class Fichier implements Element {

    private String nom;

    public Fichier(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher() {
        System.out.println("Fichier : " + nom);
    }
}