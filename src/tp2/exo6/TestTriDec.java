package tp2.exo6;
import java.util.Arrays;
import java.util.Collections;

public class TestTriDec {

	public static void main(String[] args) {
		int tab[] = {29, 12, 11, 8, 37, 17};
        Integer[] tabl = new Integer[tab.length]; 
        
        for (int i = 0; i < tab.length; i++) {
            tabl[i] = tab[i]; 
        }
        
        System.out.println("Avant le tri décroissant : " + Arrays.toString(tabl)); 
        Arrays.sort(tabl, Collections.reverseOrder()); 
        System.out.println("Après le tri décroissant : " + Arrays.toString(tabl)); 
    }
}