package Collections;
import java.util.*;
public class SetExp3 {
	public static void main(String[]args) {
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		set1.add(6);
		set1.add(3);
		set1.add(0);
		set1.add(4);
		set1.add(7);
		
		set2.add(3);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		set2.add(3);
		
		HashSet<Integer>union=new HashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
		
		HashSet<Integer>difference=new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
		HashSet<Integer>Intersection=new HashSet<>(set1);
		Intersection.retainAll(set2);
		System.out.println(Intersection);		
	}
}
