package tp2.exo1;

public class Exo1 {
	
	 public static void permuter(int x,int y) {  
		 System.out.println("\t in − avant permutation, x="+x+" et y="+y);   
		 int tmp = x;   
		 x = y;   
		 y = tmp;  
		 System.out.println("\t in − après permutation, x="+x+" et y="+y);   
		 
	 }    
	 public static void main(String[] args) {   
		 int n1 = 1;   
		 int n2 = 3;    
		 System.out.println("Avant permutation, n1="+n1+" et n2="+n2);    
		 permuter(n1,n2);   
		 System.out.println("Après permutation, n1="+n1+" et n2="+n2);  
	}
}
