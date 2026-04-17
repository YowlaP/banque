package tp1.banque;

public class Client {

		private String nom;
		private Compte[] mesComptes;
		private int nbComptes;
		
		public Client(String nom) {
			
			this.nom = nom;
			this.mesComptes = new Compte[10];
			this.nbComptes = 0;
				
		}
		
		public Compte getCompte(int i) {
			
			if(i > 0 && i < nbComptes) {
				return mesComptes[i];
			}
			return null;
			
			
		}
		
		public void soldesComptes() {
			
			System.out.println("Nom du client " + nom);
			for(int i = 0; i < nbComptes; i++) {
				System.out.println("Compte n°" + i + ":" + mesComptes[i]);
			}
			
		}
		
		public float soldeTotal() {
			
			float res = 0;
			System.out.println("Nom du client " + nom);
			for(int i = 0; i < nbComptes; i++) {
				res += mesComptes[i].getSolde();
			}
			System.out.println("Solde tous Comptes :" + res);
			return res;
			
		}
		
		public boolean ouvrirCompte() {
			
			if(nbComptes >= 10) {
				return false;
			}
			mesComptes[nbComptes] = new Compte(10);
			nbComptes ++;
			return true;
			
		}
		
		public void deposer(int i, float montant) {
			
			if(getCompte(i) != null) {
				mesComptes[i].deposer(montant);
			}
		}
		
		public void retirer(int i, float montant) {
			if(getCompte(i) != null && mesComptes[i].getSolde() > montant) {
				mesComptes[i].retirer(montant);
			}
		}
		
		public void virer(int i, int dest, float montant) {
			if(getCompte(i) == null || getCompte(dest) == null) {
				System.out.println("Au moins un des deux comptes n'existe pas" );
			}
			if(mesComptes[i].getSolde() < montant) {
				System.out.println("Pas assez de fond sur le compte" + i);
			}else {
				mesComptes[i].virer(montant, mesComptes[dest]);
			}
		}
		
		
}
