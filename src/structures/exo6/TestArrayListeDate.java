package structures.exo6;
import date.*;
public class TestArrayListeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListeDate maListe = new ArrayListeDate();

        // Création de quelques dates
        Date d1 = new Date(5, 9, 1941);
        Date d2 = new Date(20, 10, 1999);
        Date d3 = new Date(3, 1, 1967);

        // Ajout dans la liste
        maListe.ajouterDate(d1);
        maListe.ajouterDate(d2);
        maListe.ajouterDate(d3);

        System.out.println("--- Avant le tri ---");
        System.out.println(maListe.toString());

        // Test de la recherche
        System.out.println("\nRecherche de d2 (attendu: 1) : Indice " + maListe.chercherDate(d2));

        System.out.println("\n--- Tri Croissant ---");
        maListe.triArrayListCroissant();
        System.out.println(maListe.toString());

        System.out.println("\n--- Tri Décroissant ---");
        maListe.triArrayListDecroissant();
        System.out.println(maListe.toString());
	}

}
