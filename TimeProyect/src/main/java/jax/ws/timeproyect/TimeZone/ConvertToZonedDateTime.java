package jax.ws.timeproyect.TimeZone;

import java.time.ZonedDateTime;

public class ConvertToZonedDateTime {
	public static void main(String[] args) {
		//Parse string which contains ZonedDateTime - UTC to ZonedDateTime variable
		ZonedDateTime zdt = ZonedDateTime.parse("2020-08-21T02:05:45.231Z");
		System.out.println("Parse string which contains ZonedDateTime - UTC to ZonedDateTime variable: " + zdt);
		
		System.out.println("-----------");
		
		
		
	}
}
