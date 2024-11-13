package Collections;
import java.util.*;
public class ChatGpt4 {
	public static void main(String[]args) {
		HashSet<Integer>list1=new HashSet<>();
		HashSet<Integer>list2=new HashSet<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		HashSet<Integer>Intersection=new HashSet<>(list1);
		Intersection.retainAll(list2);
		System.out.println(Intersection);
		
	}
}
