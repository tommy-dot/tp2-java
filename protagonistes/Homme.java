package protagonistes;
import affrontement.Bataille;

public class Homme extends EtreVivant {

    public Homme(String nom) {
        super(nom, 100);
    }

    public String parler(String texte) {
        String message = nom + ": " + texte;
        return message;
    }

    public String mourir() {
        return "c'est ainsi que le courageux " + nom + " mourut. " ;
    }

    public String rejointBataille(Bataille bataille){
        this.bataille = bataille;
        return bataille.ajouter(this);
    }

}

