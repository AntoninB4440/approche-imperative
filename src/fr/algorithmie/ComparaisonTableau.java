package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		int total = 0;
		
		System.out.println("Les éléments de array2 présent dans array sont :");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ( array[j] == array2[i] ) {
					System.out.print( array[j] + " ");
					total++;
				}
			}
		}
		System.out.print(" \nSoit un total de : " + total + " valeurs");
	}
}
