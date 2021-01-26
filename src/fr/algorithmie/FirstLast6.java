package fr.algorithmie;

import java.util.Arrays;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,5};
		boolean verif = false;
		
		if (array.length !=0 && (array[0] == 6 || array[array.length -1] == 6)){
			verif = true;
		};
		
		System.out.println("Est-ce que l'array " + Arrays.toString(array) + " est un FirstLast6 ? : " + verif);
	}

}
