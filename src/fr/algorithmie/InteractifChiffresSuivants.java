package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

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
		System.out.print("Les 10 chiffres suivant " + nb + " sont : ");
		for (int i = nb+1; i <= nb+10; i++) {
			System.out.print(i + " ");
		}
	}

}
