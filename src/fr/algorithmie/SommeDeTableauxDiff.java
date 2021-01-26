package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		int[] arraySum = new int[ (int) Math.max(array1.length, array2.length)];
		
		
		System.out.println("Affichage de la somme des deux tableaux ayant une longueur différente");
		for (int i = 0; i < arraySum.length; i++) {
			if (array1.length > i) {
				arraySum[i] += array1[i]; 
			}
			if (array2.length > i) {
				arraySum[i] += array2[i]; 
			}
		System.out.print(arraySum[i] + " ");
		}
	}

}
