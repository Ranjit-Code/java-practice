import java.time.*;
import java.util.*;
import java.time.format.TextStyle;
public class Page{
	
	public static String getDay(int day, int month, int year){
		
		DayOfWeek name = LocalDate.parse(year + "-" + (month<10?"0"+month:month) + "-" + (day<10?"0"+day:day)).getDayOfWeek();
        return name.getDisplayName(TextStyle.FULL, Locale.CANADA).toUpperCase();
		
	}
		
	public static void main(String args[]){
		System.out.println(getDay(5,6,2024));
	}
}