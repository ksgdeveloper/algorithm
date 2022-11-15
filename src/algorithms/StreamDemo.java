package algorithms;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(41,12,14,55,11);
		list.stream().sorted((a,b) -> b.compareTo(a)).forEach(e -> System.out.print(e+","));
		System.out.println("\n");
		list.stream().sorted((a,b) -> a.compareTo(b)).forEach(e -> System.out.print(e+","));
	}
}
