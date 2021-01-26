package fr.algorithmie;

import java.util.Scanner;

public class InteractiveFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//déclaré en float pour premettre d'avoir un rang > 100
		float nbr1=0, nbr2=1, nbr3, i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez choisir un rang pour votre suite de Fibonacci :");
		int rang = scanner.nextInt();
        //print 0 and 1
		
        System.out.print(nbr1+" "+nbr2);   
    
        //La boucle commence par 2 car 0 et 1 sont deja affiches
        for(i=2; i<rang; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;  
            System.out.print(" "+nbr3); 
        }    
	}

}
