package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 int min = 99999;
		 int minIndex = 0;
		 
		 for (int i = 0; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
					minIndex = i;
				}
		 }
		System.out.println("Le minimum de l'array est " + min + " à l'index : " + minIndex);
				 
	}

}
