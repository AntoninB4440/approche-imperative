package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		
		for (int i = array.length -1 ; i >=0 ; i--) {
			arrayCopy[(array.length - 1) - i ] = array[i];
		}
		
		System.out.print("Affichage array : ");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		
		System.out.print("Affichage arrayCopy : ");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i] + " ");
		}
	}

}
