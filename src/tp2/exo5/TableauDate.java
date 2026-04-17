package tp2.exo5;

import tp1.date.*;

public class TableauDate {
	
	private Date[] tab;
	private int nbD;
	
	public TableauDate() {
		this.tab = new Date[100];
		this.nbD = 0;
	}
	
	public void ajouterDate(Date d) {
		
		if(this.nbD < 100) {
			
			this.tab[nbD] = d;
			this.nbD += 1;
		}
		else {
			System.out.println("Le tableau est plein \n");
		}
	}
	
	public int chercherDate(Date d) {
		for (int i = 0; i < nbD; i++) {
			if (tab[i].equals(d)) {
				return i;
			}
		}
		return -1;
		
	}
	
	
	@Override
	public String toString() {
		String s = "Contenu du tableau : \n";
		for (int i = 0; i <nbD; i++) {
			s += tab[i] + "\n";
			
		}
		return s;
	}
	
	
	
}
