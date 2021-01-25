package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {6,1,2,5,6};
		boolean verif = false;
		
		if (array.length !=0 && (array[0] == 6 || array[array.length -1] == 6)){
			verif = true;
		} else {
			verif = false;
		}
		
		System.out.println("Est-ce que array est un FirstLast6 ? : " + verif);
	}

}
