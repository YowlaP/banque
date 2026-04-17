package tp6;

public class  ExceptionInseeErronee extends Exception {
	
	public ExceptionInseeErronee(long insee) {
		super("Aucune personne trouvée avec le num Insee : " + insee);
	}

}
