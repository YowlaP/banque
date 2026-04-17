package tp2.exo6;
import tp1.date.*;
import java.util.Arrays;


public class TestTriObjet {
	public static void triTableauCroissant(Date[] tab) {
        Arrays.sort(tab);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date[] mesDates = {
	            new Date(5, 9, 1941),
	            new Date(20, 10, 1999),
	            new Date(3, 1, 1967)
	        };
		
		System.out.println("Avant le tri : " + Arrays.toString(mesDates));
        triTableauCroissant(mesDates);
        System.out.println("Après le tri : " + Arrays.toString(mesDates));
	}

}
