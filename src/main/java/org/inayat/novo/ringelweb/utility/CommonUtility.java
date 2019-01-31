package org.inayat.novo.ringelweb.utility;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CommonUtility {
	
	public static Timestamp StringToDate(String date) throws ParseException {
		   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
             //format -"2014-08-22 15:02:51:580"
		    dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		    Date parsedTimeStamp = dateFormat.parse(date);
		    Timestamp timestamp = new Timestamp(parsedTimeStamp.getTime());
		    return timestamp;
	}

}
