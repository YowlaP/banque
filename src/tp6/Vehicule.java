package tp6;

import tp1.date.Date;

public class Vehicule extends Bien {

	private String immatriculation;
	private String type;
	private Date dateCirculation;
	
	public Vehicule(float valeur, String i, String type, Date d) throws ExceptionValeurErronee {
		super(valeur);
		this.immatriculation = i;
		this.type = type;
		this.dateCirculation = d;
	}
	
	@Override
	public String toString() {
		return "Vehicule (Immatriculation : " + immatriculation + 
						  " Type : " + type + 
						  " Date : " + dateCirculation +
						  " Valeur : " + getValeur() + ")"; 
	}
}
