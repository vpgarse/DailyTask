package dateFormate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Past_Date {

	public static void main(String[] args) {
		
	
	
		/*
		 * Date today = new Date(); Calendar cal = new GregorianCalendar();
		 * cal.setTime(today); cal.add(Calendar.DATE, -10); Date today30 =
		 * cal.getTime(); System.out.println(today30);
		 */
	
	
	
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a");
	LocalDateTime now = LocalDateTime.now();
	LocalDateTime getdate = now.minusDays(3);
	System.out.println(dtf.format(getdate).toString());
	}
}
