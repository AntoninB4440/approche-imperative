package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		
		int counter = 0;
		int userChoice = 0;
		
		while(userChoice != 3) {
			System.out.println("------------------");
			userChoice = availableOption(scanner);
			if (userChoice == 1) {
				counter = valeurInteger(scanner,array,counter);
			} else if (userChoice == 2) {
				affichageArray(array);
			}
			if (counter == array.length) {
				array = arrayUp(array);
			}
		}
		System.out.println("Fermeture du programme, Au revoir");
		scanner.close();
	}
	
	static int availableOption(Scanner scanner) {
		System.out.println("Choix d'option :");
		System.out.println("1 - Ajouter une valeur à votre tableau :");
		System.out.println("2 - Afficher le contenu de votre tableau :");
		System.out.println("3 - Fermeture de programme :");
		return scanner.nextInt();
	}
	
	static int valeurInteger(Scanner valeur,int[] array, int counter ) {
		System.out.println("Veuillez saisir une valeur à ajouter à votre tableau :");
		array[counter] = valeur.nextInt();
		counter ++;
		return counter;
	}
	
	static void affichageArray(int[] array) {
		System.out.print("Voici le tableau actuel : ");
		System.out.println(Arrays.toString(array));
	}
	
	static int[] arrayUp(int[] array) {
		System.out.println("Agrandissement du tableau en cours .....");
		int[] newArray = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	
	
}
