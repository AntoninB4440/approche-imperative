package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre : ");
		int nb = scanner.nextInt();
		
		while (nb > 10 || nb <1) {
			System.out.println("-------------------------");
			System.out.println("Sorry votre nombre est incorrecte, veuillez resaisir (entre 1 et 0): ");
			nb = scanner.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println("La sommes arithmérique de 0 à " + nb + " est : ");
		int sum = 0;
		for (int i = 0; i <= nb; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
