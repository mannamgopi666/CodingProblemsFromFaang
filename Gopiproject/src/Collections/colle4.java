package Collections;
import java.util.*;
public class colle4 {
	public static void main(String[]args) {
		HashMap<String,Integer> fruits=new HashMap<>();
		fruits.put("Apple",2);
		fruits.put("Banana",4);
		fruits.put("Orange",8);
		fruits.put("Mango",3);
		Set<String>keyset=fruits.keySet();
		//fruits.remove("Mango");
		fruits.put("Pine apple",2);
		System.out.println(fruits.get("Orange"));
		
		for(String key:keyset) {
			System.out.println(key+":"+fruits.get(key));
		}
		System.out.println("The fruits we have:"+fruits);
		if(keyset.contains("Orange")) {
			System.out.println("There are Oranges in the Map");	
		}
		fruits.remove("Orange");
		System.out.println("After Removing Orange from the map , The remaining fruits are:"+keyset);
		
			
		}
		
	}

