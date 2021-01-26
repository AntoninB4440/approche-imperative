package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		int lastValue = array[array.length -1];
		System.out.println("Nous allons effectuer une rotation à droite de l'array suivant : " + Arrays.toString(array));
		
		for (int i = array.length - 1 ; i >=0 ;i--) {
			
			if (i == 0) {
				array[i] = lastValue;
			} else {
				array[i] = array[i-1];
			}
			
		}
		
		System.out.println("----------------------");
		System.out.println("L'array avec la rotation à droite donne : " + Arrays.toString(array));

	}

}
