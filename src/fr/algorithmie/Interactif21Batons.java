package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numSticks = 21;
		
		//Goes First Scanner
		Scanner input = new Scanner(System.in);
		
		//NbStick taken Scanner;
		Scanner take = new Scanner(System.in);
		int numToTake = 0;
		
		System.out.println("Voulez vous jouer en 1er ? (Y/n) ");
		String goFirst = input.nextLine();
		
		while(numSticks > 0) {
			
			if(goFirst.equals("y") || goFirst.equals("Y")) {
				System.out.println("Il y a " + numSticks + " bâtons restants");
				System.out.println("-------------------");
				System.out.println("Combien voulez vous en prendre (1, 2 ou 3) ? ");
				numToTake = take.nextInt();
				
				if(numToTake > 3) {
					numToTake = 3;
				} else if (numToTake < 1) {
					numToTake = 1;
				}
				numSticks -= numToTake;
				System.out.println("Il reste " + numSticks + " en jeu");
				
				if(numSticks <=0) {
					System.out.println("You lose sorry !");
				} else {
					if (numSticks - 3 == 0 || (numSticks - 3) % 3 == 1 ) {
						numToTake = 2;
					} else if (numSticks - 2 == 0 || (numSticks - 2) % 3 == 0 ) {
						numToTake = 1;
					} else {
						numToTake = 3;
					}
					System.out.println("L'ordi a prit " + numToTake + " bâtons");
					numSticks -= numToTake;
					
					if(numSticks <=0) {
						System.out.println("You win buddy !");
					}
				}
			} else {
				if (numSticks - 3 == 0 || (numSticks - 3) % 3 == 2 ) {
					numToTake = 2;
				} else if (numSticks - 2 == 0 || (numSticks - 2) % 3 == 0 ) {
					numToTake = 1;
				} else {
					numToTake = 3;
				}
				System.out.println("L'ordi a prit " + numToTake + " bâtons");
				numSticks -= numToTake;
				System.out.println("Il reste " + numSticks + " en jeu");
				
				if(numSticks <=0) {
					System.out.println("You win buddy !");
				} else {
					System.out.println("Combien voulez vous en prendre (1, 2 ou 3) ? ");
					numToTake = take.nextInt();
					
					if(numToTake > 3) {
						numToTake = 3;
					} else if (numToTake < 1) {
						numToTake = 1;
					}
					numSticks -= numToTake;
					System.out.println("Il reste " + numSticks + " en jeu");
					
					if(numSticks <=0) {
						System.out.println("You lose sorry !");
					} 
				}
			}
		}
	}

}
