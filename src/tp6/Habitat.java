package tp6;

public class Habitat extends Bien {
    private String adresse;
    private String type;

    public Habitat(String type , String adresse, float valeur) throws ExceptionValeurErronee {
        super(valeur);
        this.adresse = adresse;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Habitat (valeur=" + getValeur()
             + ", adresse=" + adresse
             + ", type=" + type + ")";
    }
}