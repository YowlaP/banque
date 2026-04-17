package structures.exo5;

import date.*;
public class TestTableauDate {

	public static void main(String[] args) {
		Date d1 = new Date(3, 1, 1967);
		Date d2 = new Date(5, 9, 1941);
		Date d3 = new Date(20, 10, 1999);
		Date d4 = new Date(6, 7, 1970);
		TableauDate tab = new TableauDate();
		tab.ajouterDate(d1);
		tab.ajouterDate(d2);
		tab.ajouterDate(d3);
		tab.ajouterDate(d4);
		System.out.println(tab);
		System.out.println(tab.chercherDate(d2));
		Date dch = new Date(5, 9, 1941);
		System.out.println(tab.chercherDate(dch));

	}

}
