package Collections;
import java.util.*;
public class Colle3 {
	public static void main(String[]args) {
		HashMap<String,Integer> scores=new HashMap<>();
		scores.put("Virat",18);
		scores.put("ABD", 17);
		scores.put("Rohit", 45);
		scores.put("will Jacks", 43);
		System.out.println(scores.get("Virat"));
	     Set <String> keySet =scores.keySet();
	     System.out.println(keySet);
		for(String Key:keySet) {
			System.out.println(Key+":"+scores.get(Key));
			
		}
	}

}
