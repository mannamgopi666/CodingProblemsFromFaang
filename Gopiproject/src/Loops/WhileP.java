package Loops;
import java.util.Scanner;
public class WhileP {
	public static void main (String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		//int i=scr.nextInt();
		while(n<=7) {
			System.out.println("Hello "+n);
			int i=scr.nextInt();
			while(i<=3) {
				System.out.println("Mannam "+i);
				i++;
			}	
			n++;
		}
	}
}
