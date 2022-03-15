package entity;

import java.security.SecureRandom;

public class SequenceToArray {
	private static SecureRandom randomNumbers = new SecureRandom();
	public int[] generateRandomSequency(int size) {
		int[] vect = new int[size];
		
		for (int i=0; i<size; i++) {
			vect[i] = randomNumbers.nextInt(9);
		}	
		return vect;
	
	}
}
