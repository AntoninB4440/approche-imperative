package fr.algorithmie;

import java.util.Iterator;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Affichage des valeurs d'un tableau");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println("Affichage des valeurs d'un tableau en sens inverse");
		for (int i = array.length -1 ; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println("Copie de array dans arrayCopy et affichage de ce dernier");
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
