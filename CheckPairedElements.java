import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class CheckPairedElements{
	public static int checkPairing(int[] arr){
		int oddValue = 0;
		Map<Integer, Long> map = Arrays.stream(arr)
										.boxed()
										.collect(Collectors.groupingBy(
											Function.identity(),
											Collectors.counting()
										));
		
		for(Map.Entry<Integer, Long> entry : map.entrySet()){
			if(entry.getValue()%2!=0){
				oddValue = entry.getKey();
				break;
			}
		}
		
		return oddValue;
		
	}
	
	public static void main(String args[]){
		System.out.println(checkPairing(new int[]{1,3,5,3,5,1,7}));
	}
}