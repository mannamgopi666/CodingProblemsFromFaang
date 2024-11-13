package Collections;
import java.util.*;
public class ChatGpt3 {
	public static void main(String[]args) {
		TreeSet<Integer>list1=new TreeSet<>();
		TreeSet<Integer>list2=new TreeSet<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		TreeSet<Integer>union=new TreeSet<>(list1);
		union.addAll(list2);
		System.out.println(union);
	}
}
