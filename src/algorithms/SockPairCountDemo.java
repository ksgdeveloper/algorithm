package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockPairCountDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 20, 50);
		int number = numbers.size();
		int sockPairs = sockMerchant(number, numbers);
		System.out.println(sockPairs);
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		
		Map<Integer, Integer> intMap = new HashMap<>();
		for(Integer num : ar) {
			if(intMap.containsKey(num)) {
				intMap.put(num, intMap.get(num)+1);
			}else {
				intMap.put(num, 1);
			}
		}
		
		return intMap.values().stream().mapToInt(d->d/2).sum();
	}

}
