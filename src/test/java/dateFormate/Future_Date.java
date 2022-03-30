package dateFormate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Future_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Calendar cal = Calendar.getInstance(); System.out.println("current date: " +
		 * cal.getTime()); cal.add(Calendar.DATE, 7);
		 * System.out.println("7 days later: " + cal.getTime());
		 */
		
		
		
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime getdate = now.plusDays(3);
		System.out.println(dtf.format(getdate).toString());
	}

}
