package Loops;
import java.util.*;
public class Prim {
	public static void main(String[]args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++)
			if(n%i == 0)
				count++;
		if(count == 2)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");
	}
}
