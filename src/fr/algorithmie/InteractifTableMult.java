package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entre 1 et 10 (compris) : ");
		int nb = scanner.nextInt();
		
		while (nb >= 10 || nb <= 1) {
			System.out.println("-------------------------");
			System.out.println("Sorry votre nombre est incorrecte, veuillez en resaisir: ");
			nb = scanner.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println("Table de multiplication de : " + nb);
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " x " + nb + " = " + i*nb);
		}
	}

}
