/* that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1. */

import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

public class SearchElement {
    public static int solution(int[] A) {
		OptionalInt max = Arrays.stream(A).max();
		OptionalInt min = Arrays.stream(A).min();
		List<Integer> ls = Arrays.stream(A).boxed().collect(Collectors.toList());
        // Implement your solution here
        List<Integer> missingValues = IntStream.rangeClosed(min.getAsInt(), max.getAsInt())
										.filter(element -> !ls.contains(element))
										.boxed()
										.collect(Collectors.toList());
		
		if(missingValues.size() > 0){
			if(missingValues.get(0) <= 0){
				return 1;
			} else {
				return Collections.min(missingValues);
			}
		} else {
			return 1;
		}
		
		       
    }
	
	public static void main(String args[]){
		
		System.out.println(solution(new int[]{-1, -3}));
	}
}