package Collections;
import java.util.*;

public class ArrayListExamp1 {
	public static void main(String[]args) {
		ArrayList<String> countries=new ArrayList<>();
		
		//Adding Elements
		
		countries.add("China");
		countries.add("Japan");
		countries.add("India");
		countries.add(null);
		
		//Accessing Elements by indices
		
		System.out.println("The Second most populated Country: "+ countries.get(0));
		System.out.println("The first most populated Country: "+countries.get(2));
		System.out.println(countries);
		
		//iterating Over Elements
		
		for( String Country:countries) {
			System.out.println(Country);
		}
		
		
	}

}
