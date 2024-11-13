package Collections;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter list size :");
		int [] array = new int[scn.nextInt()];
		System.out.println("Enter list of values:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
		}
		
		int maxInt = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(maxInt < array[i]) {
				maxInt = array[i];
			}
		}
		
		System.out.println("Maximium number from the list: " + maxInt);
	}
	
}
