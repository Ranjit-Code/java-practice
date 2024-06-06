import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidUsername{
	
	public static void validUser(String name){
		String regex = "[a-zA-Z][a-zA-Z_0-9]{7,29}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean isValid = m.matches();
		System.out.println(isValid);
	}
	
	public static void main(String args[]){
		validUser("Samantha");
	}
}