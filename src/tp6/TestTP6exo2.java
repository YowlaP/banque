package tp6;

import tp1.date.Date;
public class TestTP6exo2 {
public static void main(String[] args) {
Personne p1=new Personne("P1", 20001L);
Personne p2=new Personne("P2", 2233L);
Bien b1=new Vehicule (12000, "12 ABC 31","Peugeot 206", new Date(3, 5, 2015));
Bien b2=new Vehicule (15000, "5412 XYZ 31","Toyota", new Date(19, 8, 2013));
Bien b3=new Habitat ("31 TOULOUSE","Maison",100000);
Bien b4=new Habitat ("31 BALMA","Appartement",50000);
p1.ajouterBien(b1);
p1.ajouterBien(b3);
p2.ajouterBien(b2);
p2.ajouterBien(b4);
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(p1);
System.out.println(p2);
}
}
