package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entre 1 et 10 (compris) : ");
		int nb = scanner.nextInt();
		
		while (nb > 10 || nb <1) {
			System.out.println("-------------------------");
			System.out.println("Sorry votre nombre est incorrecte, veuillez resaisir (entre 1 et 10): ");
			nb = scanner.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.print("La sommes arithm�rique de 0 � " + nb + " est : ");
		int sum = 0;
		for (int i = 0; i <= nb; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
