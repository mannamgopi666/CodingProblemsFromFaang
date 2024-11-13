package Collections;
import java.util.*;
public class SetExp2 {
	public static void main(String[]args) {
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(7);
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		numbers.add(5);
		
		numbers.remove(8);
		numbers.add(4);
		
		System.out.println("Numbers in TreeSet:" +numbers);
		System.out.println("The Smallest Number In the set:"+numbers.first());
		System.out.println("The Largest Number in the Set: "+numbers.last());
		}

}
