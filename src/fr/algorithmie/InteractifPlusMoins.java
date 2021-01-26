package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int random = (int) Math.round(Math.random() * 100);
		int counter = 0;
		
		System.out.println("Bienvenue dans le jeu du \" c\'est plus ou moins \" ");
		System.out.println("La valeur à trouver se trouve entre 1 et 100 (compris)");
		System.out.println("Veuillez saisir un nombre :");
		int guess = scanner.nextInt();
		
		while (guess != random) {
			if (guess > random) {
				System.out.println("C'est MOINS, nouvelle tentative :");
			}
			if(guess < random) {
				System.out.println("C'est PLUS, nouvelle tentative :");
			}
			counter++;
			guess = scanner.nextInt();
		}
		counter++;
		System.out.println("-------------------------");
		System.out.println("Bravo vous avez trouvé : " + random + " en " + counter + " coup(s)");
		
	}

}
