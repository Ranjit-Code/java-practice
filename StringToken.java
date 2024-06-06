import java.util.*;
import java.util.stream.Stream;
public class StringToken{
		
	public static void printTokens(String token){
	
		String str[] = token.split("[ !,?._'@]+");
		Stream.of(str).forEach((word) -> System.out.println(word));
	}
	
	public static void main(String args[]){
		printTokens("He is a very very good boy, isn't he?");
		
	}
}