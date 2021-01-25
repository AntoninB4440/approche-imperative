package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		int lastValue = array[array.length -1];
		
		for (int i = array.length - 1 ; i >=0 ;i--) {
			
			if (i == 0) {
				array[i] = lastValue;
			} else {
				array[i] = array[i-1];
			}
			
		}
		
		System.out.println("L'array avec une rotation à droite donne : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
