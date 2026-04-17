package tp6;

import tp1.date.Date;

public class TestTP6exo4 {
    public static void main(String[] args) {

        // Création de personnes (enregistrement automatique dans la HashMap)
        try {
            Personne p1 = new Personne("Alice", 10001L);
            Personne p2 = new Personne("Bob", 10002L);
            Personne p3 = new Personne("Clara", 10003L);

            Bien b1 = new Vehicule(12000, "12 ABC 31", "Peugeot", new Date(3, 5, 2015));
            Bien b2 = new Habitat("31 TOULOUSE", "Maison", 200000);
            p1.ajouterBien(b1);
            p1.ajouterBien(b2);

            Bien b3 = new Vehicule(8000, "99 ZZZ 31", "Renault", new Date(1, 1, 2010));
            p2.ajouterBien(b3);

        } catch (ExceptionValeurErronee e) {
            System.out.println("Erreur valeur : " + e.getMessage());
        }

        System.out.println("=== Toutes les personnes ===");
        Personne.afficheToutesLesPersonnes();

        // Recherche par INSEE valide
        System.out.println("=== Recherche INSEE valide ===");
        try {
            Personne p = Personne.getPersonne(10001L);
            System.out.println("Trouvé : " + p.getNom());
        } catch (ExceptionInseeErronee e) {
            System.out.println(e.getMessage());
        }

        // Recherche par INSEE invalide → exception
        System.out.println("=== Recherche INSEE invalide ===");
        try {
            Personne p = Personne.getPersonne(99999L);
            System.out.println("Trouvé : " + p.getNom());
        } catch (ExceptionInseeErronee e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}