package protagonistes;
import affrontement.Bataille;


public class dragon extends EtreVivant {
    private static final int VIE_DE_DEPART = 200;

    public dragon(String nom) {
        super(nom, VIE_DE_DEPART);
    }
    public String mourir() {
        return "c'est ainsi que le dragon " + nom + " mourut. " ;
    }
    public String rejointBataille(Bataille bataille){
        this.bataille = bataille;
        return bataille.ajouter(this);
    }
}
