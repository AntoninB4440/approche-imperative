package fr.algorithmie;

import java.util.Arrays;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 double sum = 0;
		 double moyenne;		 
		 for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		 }
		 
		 moyenne = sum/array.length;
		 System.out.println("Calcul de la moyenne de cette array : " + Arrays.toString(array));
		 System.out.println("La moyenne de l'array est : " + moyenne);
	}

}
