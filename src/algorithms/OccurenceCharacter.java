package algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceCharacter {
	public static void main(String[] args) {
		String str = "all that glitters is not gold";
		
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		for(int i=0; i<str.length() ; i++){
			char c = str.charAt(i);
			if(charCountMap.containsKey(c)) {
				charCountMap.replace(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		
		charCountMap.forEach((k,v) -> System.out.println("Key " + k + ": Value " + v+ ","));
		System.out.println("traditional iteration");
		
		Iterator<Map.Entry<Character, Integer>> iterator = charCountMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Character, Integer> tempMap = iterator.next();
	        System.out.println(tempMap.getKey() + ":" + tempMap.getValue());
		}
		
	}
}
