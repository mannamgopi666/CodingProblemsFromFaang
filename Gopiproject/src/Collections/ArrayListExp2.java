package Collections;
import java.util.*;
public class ArrayListExp2 {
	public static void main (String[]args) {
		ArrayList<String> players=new ArrayList<>();
		
		//Adding Element
		players.add(" Kohli");
		players.add("Siraj");
    	players.add("Will Jacks");
		players.add("Rajat Patidar");
		players.add("Maxwell");
		players.add("Dinesh Karthik");
		
		//Removing Element
		players.remove("Dinesh Karthik");
		
		//modifying an Element
		players.set(4,"Cameron Green");
		
		//Adding an Element Between List
		players.add(5,"Faf");
		
		//Array Size
		System.out.println("The size of the Array is: "+players.size());
		
		//Accessing indices
		System.out.println("Highest Run Scorer For RCB is: "+players.get(0));
		System.out.println("The Highest StrikeRate in RCB :"+players.get(3));
		System.out.println("The retentions of RCB 2024 is:");
		
		//Iterating Over Elements
		for(String retentionsList:players) {
			System.out.println(retentionsList);	
		}	
			} 
		}	

	
