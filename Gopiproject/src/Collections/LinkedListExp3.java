package Collections;
import java.util.*;
public class LinkedListExp3 {
	public static void main(String[]args) {
		LinkedList<String> mobiles=new LinkedList<>();
		//inserting elements
		mobiles.add("Iphone");
		mobiles.add("Samsung");
		mobiles.add("Redmi");
		mobiles.add("Realme");
	
		//Removing Elements
//		mobiles.remove();
//		mobiles.removeFirst();
//		mobiles.removeLast();
	
		
		//Adding Elements
		mobiles.add("OPPO");
		mobiles.addFirst("Vivo");
		mobiles.add(2,"Moto");
		
		//Usefull methods
	    System.out.println(	mobiles.size());	
		System.out.println(mobiles.get(2));
		System.out.println(mobiles.isEmpty());
		System.out.println(mobiles.contains("Oppo"));
		System.out.println(mobiles.indexOf("Samsung"));
		//System.out.println(mobiles.remove(1));
		
		for( String smartPhones:mobiles) {
			System.out.println(smartPhones);
		}
				
	}
}
