package com.Gopi;
import java.util.ArrayList;
import java.util.HashMap;

public class Coll{	
	
	    public static void main(String[] args) {
	        // Using ArrayList
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        System.out.println("Fruits: " + fruits);

	        // Using HashMap
	        HashMap<String, Integer> fruitPrices = new HashMap<>();
	        fruitPrices.put("Apple", 2);
	        fruitPrices.put("Banana", 1);
	        fruitPrices.put("Cherry", 3);
	        System.out.println("Fruit Prices: " + fruitPrices);
	    }
}
