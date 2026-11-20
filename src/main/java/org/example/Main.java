public class Main {
    public static void main(String[] args) {

        Dossier documents = new Dossier("Documents");

        Fichier f1 = new Fichier("Java.pdf");
        Fichier f2 = new Fichier("Python.pdf");

        Dossier images = new Dossier("Images");
        Fichier f3 = new Fichier("Photo.png");

        images.ajouter(f3);

        documents.ajouter(f1);
        documents.
                ajouter(f2);
        documents.ajouter(images);

        documents.afficher();
    }
}