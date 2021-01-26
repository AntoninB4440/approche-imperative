package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];
		int max = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println("Veuillez rentrer la valeur " + (i+1) + " : ");
			int nb = scanner.nextInt();
			array[i] = nb;
			if (nb > max ) {
				max = nb;
			}
		}
				
		System.out.println("-------------------------");
		System.out.println("Vous avez rentré les valeurs suivantes : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n-------------------------");
		System.out.println("La valeur max de ce tableau est : " + max) ;
		
		
	}
}

