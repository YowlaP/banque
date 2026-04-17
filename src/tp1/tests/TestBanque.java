package tp1.tests;

import tp1.banque.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte c1 = new Compte(1000);
		Compte c2 = new Compte(2000);
		
		c1.deposer(200);
		c2.deposer(500);
		c2.retirer(200);
		c1.retirer(100);
		c1.virer(75, c2);
		
		c1.afficher();
		c2.afficher();
		
		// Création d'un tableau de 10 comptes
		Compte[] mesComptes = new Compte[10];
		
		for(int i = 0; i < mesComptes.length; i++) {
			mesComptes[i] = new Compte(0);
			float depot = 150 + (i * 50);
			mesComptes[i].deposer(depot);
			
		}
		
		for(int i = 0; i < mesComptes.length; i++) {
			for(int j = i + 1 ; j < mesComptes.length; j++) {
				
					mesComptes[i].virer(10, mesComptes[j]);
			}
			
		}
		
		for (int i = 0; i < mesComptes.length; i++) {
			System.out.println("Compte " + i + " : " + mesComptes[i]);
		}
        
		
		
	}

}
