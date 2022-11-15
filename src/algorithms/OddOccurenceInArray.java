package algorithms;

import java.util.HashMap;
import java.util.Map.Entry;

public class OddOccurenceInArray {
	public static void main(String[] args) {
		
		int arr[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		HashMap<Integer, Integer> oddOccurence = new HashMap<>();
		
		oddOccurence = getOddOccurenceFromArray(arr);
		
		for(Entry<Integer, Integer> entry : oddOccurence.entrySet()) {
			if(entry.getValue()%2 == 1) {
				System.out.println("Odd entries of the : " + entry.getKey());
			}else {
				System.out.println("Other entries of the : " + entry.getKey());
			}
		}
	}

	private static HashMap<Integer, Integer> getOddOccurenceFromArray(int a[]) {
		HashMap<Integer, Integer> oc = new HashMap<>();
		
		for(int i=0; i<a.length ; i++) {
			if(!oc.containsKey(a[i])) {
				oc.put(a[i], 1);
			}else {
				oc.put(a[i], oc.get(a[i])+1);
			}
		}
		return oc;
	}
}	
