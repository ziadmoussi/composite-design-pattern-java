import java.util.ArrayList;
import java.util.List;

public class Dossier implements Element {

    private String nom;
    private List<Element> elements = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public void ajouter(Element element) {
        elements.add(element);
    }

    public void supprimer(Element element) {
        elements.remove(element);
    }

    @Override
    public void afficher() {
        System.out.println("Dossier : " + nom);

        for (Element element : elements) {
            element.afficher();
        }
    }
}