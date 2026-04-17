package tp2.exo2;  

public class Exo2 {  
	public static void permuter(int[] t, int i, int j) {   
		System.out.println("\tin − avant permutation tab = {"+t[0]+", "+t[1]+", "+t[2]+"}");   
		int tmp = t[i];   
		t[i] = t[j];   
		t[j] = tmp;   
		System.out.println("\tin − avant permutation tab = {"+t[0]+", "+t[1]+", "+t[2]+"}");  
	}  
	public static void main(String[] args) {   
		int tab[]= {2, 3, 4};    
		System.out.println("Avant permutation tab = {"+tab[0]+", "+tab[1]+", "+tab[2]+"}");   
		permuter(tab,0,2);   
		System.out.println("Avant permutation tab = {"+tab[0]+", "+tab[1]+", "+tab[2]+"}");  
	}  
} 
