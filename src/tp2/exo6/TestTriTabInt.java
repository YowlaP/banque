package tp2.exo6;
import java.util.Arrays;

public class TestTriTabInt {
    public static void main(String[] args) {
        int tab[] = {29, 12, 11, 8, 37, 17};
        
        System.out.println("Avant le tri croissant : " + Arrays.toString(tab)); 
        Arrays.sort(tab); // Tri selon l'ordre croissant 
        System.out.println("Après le tri croissant : " + Arrays.toString(tab));
    }
}