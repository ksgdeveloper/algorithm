package algorithms;

import java.util.Arrays;
import java.util.List;

public class StatisticsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,5);
		
		double mean = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("Mean is " +mean);
		
		double median = list.stream().sorted().skip(Math.max(0, ((list.size() + 1) / 2) - 1))
                .limit(1 + (1 + list.size()) % 2).mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Median is "+median);
	}

}
