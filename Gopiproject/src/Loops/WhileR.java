package Loops;
import java.util.*;
public class WhileR {
	public static void main(String[]args) {
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt();
	int rem=0;
	int rev=0;
	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		System.out.println(rev);
	}
}
}
