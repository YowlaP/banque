package patrimoine;

public class Bien {
	
	private float valeur;
	
	public Bien(float valeur) throws ExceptionValeurErronee {
		if(valeur <= 0) {
			throw new ExceptionValeurErronee(valeur);
		}
		
		this.valeur = valeur;
	}
	
	public float getValeur() {
		return this.valeur;
	}
	
	@Override
	public String toString() {
		
		return "Bien, Valeur :" + valeur; 
	}

}
