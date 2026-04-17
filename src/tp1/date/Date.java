package tp1.date;

public class Date implements Comparable<Date> {
	
	private int jour;
	private int mois;
	private int annee;

	public Date(int jour, int mois, int annee) {
		
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		
	}
	
	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee; 
	}
	
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Même adresse mémoire
        if (obj == null || getClass() != obj.getClass()) return false; // Types différents
        
        Date autreDate = (Date) obj;
        // On compare les attributs (en supposant qu'ils s'appellent jour, mois, annee)
        return this.jour == autreDate.jour && 
               this.mois == autreDate.mois && 
               this.annee == autreDate.annee;
    }

	@Override
	public int compareTo(Date o) {
		
		if(this.annee != o.annee) {
			return this.annee - o.annee;
		}
		if(this.mois != o.mois) {
			return this.mois - o.mois;
		}
		// meme annee et meme mois donc on compare les jours
		return this.jour - o.jour;
		
	}

	
}

