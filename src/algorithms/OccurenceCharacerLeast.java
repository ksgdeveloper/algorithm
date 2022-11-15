package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceCharacerLeast {
	public static void main(String[] args) {
		String str = "easiest";
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		int i=0;
		while(i < str.length()) {
			
			Character c = str.charAt(i);
			if(hm.containsKey(c)) {
				// increment the count
				hm.put(c, hm.get(c)+1);
			}else {
				//initialize the count
				hm.put(str.charAt(i), 1);
			}
			i++;
		}
		System.out.println(hm);
		
		hm.forEach(
				(k,v)-> System.out.println("key " + k + " Value " + v)
		);
		System.out.println("\n");
		for(Map.Entry<Character, Integer> theEntry : hm.entrySet()) {
			
			if(theEntry.getValue()==1) {
				System.out.println("First Key with only non repeated character " + theEntry.getKey() );
				break;
			}
		}
	}
}
