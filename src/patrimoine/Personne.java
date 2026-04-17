package patrimoine;

import java.util.ArrayList;
import java.util.HashMap;

public class Personne{
	
	private String nom;
    private long numeroInsee;
    private ArrayList<Bien> biens;
    
    private static HashMap<Long, Personne> toutesLesPersonnes = new HashMap<>();
    
    public Personne(String nom, long numeroInsee) {
    	this.nom = nom;
    	this.numeroInsee = numeroInsee;
    	this.biens = new ArrayList<>();
    	
    	toutesLesPersonnes.put(numeroInsee, this);
    }
    
    public void ajouterBien(Bien b) {
    	biens.add(b);
    }
    
    public float capital() {
    	float total = 0;
    	for (Bien b : biens) {
    		total += b.getValeur();
		}
    	return total;
    	
    }
    
    public static void afficheToutesLesPersonnes() {
    	for(Personne p : toutesLesPersonnes.values()) {
    		System.out.println(p);
    	}
    }
    
    public String getNom() {
    	return this.nom;
    }
    
    public static Personne getPersonne(long insee) throws ExceptionInseeErronee {
    	Personne p = toutesLesPersonnes.get(insee);
    	if(p == null) {
    		throw new ExceptionInseeErronee(insee);
    	}
    	return p;
    }
    
    @Override
    public String toString() {
        String s = "Personne [nom=" + nom + ", INSEE=" + numeroInsee
                 + ", capital=" + capital() + "]\n";
        for (Bien b : biens) {
            s += "  -> " + b + "\n";
        }
        return s;
    }

}
