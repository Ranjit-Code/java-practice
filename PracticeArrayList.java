import java.util.*;
import java.util.stream.Stream;

public class PracticeArrayList{
	
	public static void main(String args[]){
	
		List<Integer> ls = new ArrayList<>();
		
		ls.add(1);ls.add(2);ls.add(10);
		ls.add(3);ls.add(4);ls.add(5);ls.add(6);ls.add(7);ls.add(8);ls.add(9);
		
		Iterator itr = ls.iterator();
		
		Stream.of(ls).forEach(System.out::println);
		
		ls.remove(5);
		
		Stream.of(ls).forEach(System.out::println);
		
		System.out.println(ls.get(7));
		
		Collections.sort(ls, Collections.reverseOrder());
		
		Stream.of(ls).forEach(System.out::println);
		
	}
	
}