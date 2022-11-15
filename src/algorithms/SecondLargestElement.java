package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-2));
       
	}

}
