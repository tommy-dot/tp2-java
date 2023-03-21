package protagonistes;

public class heros extends Homme {

    public heros(String nom) {
        super(nom);
        this.vie = 150;
    }

    @Override
    public String parler(String texte) {
        return "Le héros " + nom + ": " + texte ;
    }
}
