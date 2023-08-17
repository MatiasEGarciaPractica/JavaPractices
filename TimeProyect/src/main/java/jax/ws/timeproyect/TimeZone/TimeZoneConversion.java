package jax.ws.timeproyect.TimeZone;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//how to convert timezone to another timezone
public class TimeZoneConversion {

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss a z");
	
	public static void main(String[] args) {
		
		//clock with UTC time
		Clock clock = Clock.systemUTC();
		
		//Getting source timeZone id
		ZoneId sourceTimeZone = ZoneId.of("Asia/Kolkata");
		
		//Getting Target timeZone id
		ZoneId destinationTimeZone = ZoneId.of("Europe/London");
		
		//CUrrent datetime time
		LocalDateTime todayDateTime = LocalDateTime.now();
		
		ZonedDateTime utcTimeZone = ZonedDateTime.now(clock);
		
		//ZOned date time at source timezone // IST is from india
		ZonedDateTime currentISTZonedDateTime = todayDateTime.atZone(sourceTimeZone);
		
		//Zoned date time at target timezone // BST is from europe
		ZonedDateTime currentBSTZonedDateTime = currentISTZonedDateTime.withZoneSameInstant(destinationTimeZone);
		
		
		System.out.println(dateTimeFormatter.format(currentISTZonedDateTime));
		System.out.println(dateTimeFormatter.format(currentBSTZonedDateTime));
		System.out.println("BST TIMEZONE : " + currentBSTZonedDateTime);
		System.out.println("UTC TIMEZONE "+dateTimeFormatter.format(utcTimeZone));
		System.out.println("UTC TIMEZONE whithout formatter: "+ utcTimeZone);
		
		
	}
}
