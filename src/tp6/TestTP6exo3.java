package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTP6exo3 {
    public static void main(String[] args) {
        ArrayList<Bien> biens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (biens.size() < 5) {
            System.out.print("Entrez la valeur du bien n°" + (biens.size() + 1) + " : ");
            float valeur = sc.nextFloat();
            try {
                Bien b = new Bien(valeur);
                biens.add(b);
            } catch (ExceptionValeurErronee e) {
                // La valeur est invalide : on affiche le message et on redemande
                System.out.println("Erreur : " + e.getMessage());
                System.out.println("Veuillez saisir une valeur positive.");
            }
        }

        sc.close();
        System.out.println("\nListe des 5 biens saisis :");
        for (Bien b : biens) {
            System.out.println(b);
        }
    }
}
