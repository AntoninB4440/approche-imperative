package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];
		int max = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println("Veuillez rentrer la valeur " + (i+1) + " de votre tableau: ");
			int nb = scanner.nextInt();
			array[i] = nb;
			if (nb > max ) {
				max = nb;
			}
		}
				
		System.out.println("-------------------------");
		System.out.print("Vous avez rentré les valeurs suivantes : ");
		System.out.println(Arrays.toString(array));
		System.out.println("-------------------------");
		System.out.println("La valeur max de ce tableau est : " + max) ;
		
		
	}
}

