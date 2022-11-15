package algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberStreams {
	public static void main(String[] args) {
		//Intialize list of numbers from range 1 to 100
		//List<Integer> numbers = IntStream.range(1, 101).boxed().collect(Collectors.toList());
		//System.out.println(numbers);
		
		//Printing Prime Numbers calling method reference isPrime
		IntStream.range(1, 1001).
			boxed()
				.collect(Collectors.toList())
					.stream()
							.filter(PrimeNumberStreams::isPrime)
								.filter(a -> a>2)
									.sorted().forEach(e-> System.out.println(e+" "));
	}
	
	public static boolean isPrime(int number) {
		return IntStream.range(2, (int)Math.sqrt(number)+1).noneMatch(i -> number%i == 0);
		
	}
	
	public static boolean isPrimeAlternateMethod(int number) {
		int num = Integer.valueOf(number);
	
		if(num%2 == 0) {
			return false;
		}else {
			for(int i=3 ; i<=Math.sqrt(num); i++){
				if(num%i == 0)
					return false;
			}
		}
		
		return true;
	}
}
