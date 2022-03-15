package program;

import java.util.Arrays;
import java.util.Scanner;

import entity.SequenceToArray;

public class Main {
	public static void main(String[] args) {
		System.out.print("Quantity of numbers to sequence: ");
		Scanner sc = new Scanner(System.in);
		SequenceToArray obj = new SequenceToArray();
		int size = sc.nextInt();
		int arr[] = obj.generateRandomSequency(size);
		System.out.println("Random Sequence: " + Arrays.toString(arr));
		sc.close();
	}
}
