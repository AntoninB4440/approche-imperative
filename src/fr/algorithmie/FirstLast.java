package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,5,1};
		boolean verif = false;
		
		if (array.length !=0 && array[0] == array[array.length -1]){
			verif = true;
		};
		
		System.out.println("Est-ce que array est un FirstLast ? : " + verif);
	}

}
