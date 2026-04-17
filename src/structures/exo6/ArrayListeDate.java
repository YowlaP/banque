package structures.exo6;
import date.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListeDate {
	
	private ArrayList<Date> liste;
	
	public ArrayListeDate() {
		
		this.liste = new ArrayList<Date>();
	}
	
	public void ajouterDate(Date d) {
        this.liste.add(d); 
    }
	
	public int chercherDate(Date d) {
		return this.liste.indexOf(d);
	}
	
	public void triArrayListCroissant() {
		Collections.sort(this.liste);
	}
	
	public void triArrayListDecroissant() {
		Collections.sort(this.liste, Collections.reverseOrder());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "contenu de la lste " + this.liste.toString();
	}

}

