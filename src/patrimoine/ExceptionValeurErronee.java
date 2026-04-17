package patrimoine;

public class ExceptionValeurErronee extends Exception{

	public ExceptionValeurErronee(float valeur) {
		super("Valeur erronée : "+ valeur + "La valeur d'un bien doit être positive");
	}

}
