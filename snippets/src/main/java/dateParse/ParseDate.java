package dateParse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Format date:
 * Input   -> "19/01/2018 07:54:40"
 * Output  -> "Jan 1 13:20:10"
 *
 */
public class ParseDate {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateS = "19/01/2018 07:54:40";
		Date date1 = null;
		try {
			date1 = formatter.parse(dateS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd hh:mm:ss");
		
		String dateCef = formatter2.format(date1);
		
		System.err.println("Date CEF: " + dateCef);
		
		//Date date = new Date("19/01/2018 07:54:40");   // Jan 1 13:20:10

		
	}

}
