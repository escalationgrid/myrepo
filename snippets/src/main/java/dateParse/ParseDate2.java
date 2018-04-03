package dateParse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Format date:
 * Input   -> "2018-02-28"
 * Output  -> a Date
 *
 */
public class ParseDate2 {

	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateS = "2018-02-28";
		Date date1 = null;
		try {
			date1 = formatter.parse(dateS);
			System.err.println("Date --->: " + date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}

}
