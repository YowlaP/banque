package banque;

public class Compte {
	
	private float solde;
	
	public Compte(float solde) {
		
		this.solde = solde;
		
	}
	
	public float getSolde() {
        
		return this.solde;
		
    }
	
	public void deposer(float montant) {
		
		solde += montant;
		
	}
	
	public boolean retirer(float montant) {
		
		
		if (solde < montant) {
			return false;
		}
		
		solde -= montant;
		return true;
		
	}
	
	public void virer(float montant, Compte dest) {
		
		retirer(montant);
		dest.deposer(montant);
		
	}
	
	public void afficher() {
		
		System.out.println("Solde du compte : " + this.solde + "€");
		
	}
	
	@Override
	public String toString() {
		
		return "Solde du compte = " + this.solde + "€";
		
	}
	
}
