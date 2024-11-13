package Collections;
import java.util.*;
public class SetExp {
	public static void main(String[]args) {
		HashSet<String> fruits=new HashSet<>();
		//Inserting the data
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Orange");
		fruits.add("Apple");
		//removing the elements
		fruits.remove("Orange");
		//adding an elemant
		fruits.add(null);
		//Checking if an element exists or not
		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits);
		for(String Fruits:fruits) {
			
		}
	

		
		
	}

}
