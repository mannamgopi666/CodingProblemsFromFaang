package Loops;
import java.util.Scanner;
public class primeNum {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		if(isPrime(n)) {
			System.out.println("It is Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
}
