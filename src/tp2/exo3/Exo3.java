package tp2.exo3;

import tp2.IntegerContainer;

public class Exo3 {
	public static void permuter(IntegerContainer x, IntegerContainer y) {
		System.out.println("\t in − avant permutation, x="+x+" et y="+y);
		IntegerContainer tmp = x;
		x=y;
		y=tmp;
		System.out.println("\t in − après permutation, x="+x+" et y="+y);
	}
	public static void main(String[] args) {
		IntegerContainer d1 = new IntegerContainer(5);
		IntegerContainer d2 = new IntegerContainer(12);
		System.out.println("Avant permutation, d1="+d1+" et d2="+d2);
		permuter(d1,d2);
		System.out.println("Après permutation, d1="+d1+" et d2="+d2);
	}
}
