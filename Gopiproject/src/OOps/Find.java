package OOps;
import java.util.Scanner;
public class Find {
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scr=new Scanner(System.in);
	        int n=scr.nextInt();
	        findHappyNum(n);
	    }
	        public static void findHappyNum(int n){
	            int sum=0;
	            while(n>0){
	                sum+=(n*n);
	                n/=10;
	            }
	            System.out.println(sum);
	}
}
