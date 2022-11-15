package algorithms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
	public static void main(String[] args) {
		String occurence = "All that glitters is not gold";
		//Create new HashMap Object key as String and
		Map<Character, Integer> theMap = new HashMap<Character, Integer>();
		
		for(int i=0 ; i< occurence.length(); i++) {
			char c = occurence.charAt(i);
			if(theMap.containsKey(c)) {
				int strCount = theMap.get(c);
				theMap.replace(c, strCount+1);
			}else {
				theMap.put(c,1);
			}
		}
		System.out.println("Using Lambdas");
		theMap.forEach((k, v) -> System.out.print((k + "->" + v+",")));
		
		System.out.println("\nUsing Stream");
		theMap.entrySet().stream()
	      .forEach(e -> System.out.print(e.getKey() + "->" + e.getValue() + ","));
	}
}
