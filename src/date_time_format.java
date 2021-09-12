
import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_time_format {

	public static void main(String[] args) {
		LocalDate mytime = LocalDate.now();
		System.out.println(mytime);
		
		LocalTime mytime1 = LocalTime.now();
		System.out.println(mytime1);
		
		LocalDateTime myTime2=LocalDateTime.now();
		System.out.println(myTime2);
		
		DateTimeFormatter mytime3= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myTime2.format(mytime3);
		System.out.println(formattedDate);

	}
	
	

}
