package Bubblesort;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[]args) {
	Scanner scr=new Scanner(System.in);
	System.out.println("Give n");
	int n=scr.nextInt();
	System.out.println("Give array");
	int[]a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=scr.nextInt();
	}
	System.out.println("Give k");
	int k=scr.nextInt();
	for(int i=0;i<n-k+1;i++) {
		for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(a[k-1]);
}
}
