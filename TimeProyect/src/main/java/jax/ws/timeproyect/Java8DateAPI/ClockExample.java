package jax.ws.timeproyect.Java8DateAPI;

import java.time.Clock;
import java.time.ZoneId;

public class ClockExample {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("UTC time :: " + clock.instant());
		System.out.println("UTC clock miliseconds :: " + clock.millis());
		
		Clock clockAsiaCalcutta = Clock.system(ZoneId.of("Asia/Calcutta"));
		System.out.println("Asia/Calcutta time ::" + clockAsiaCalcutta.instant());
		
		Clock clockDefaultSystemZone = Clock.systemDefaultZone();
		System.out.println("Default time zone of the system it's running on : "+clockDefaultSystemZone);
		
		Clock clockDefaultSystemZone2 = Clock.system(ZoneId.systemDefault());
		System.out.println("Default time zone of the system it's running on 2 : "+clockDefaultSystemZone2);
		
		System.out.println();
		System.out.println("Chage timezone");
		
		ZoneId zoneSingapore = ZoneId.of("Asia/Singapore");  
		Clock clockSingapore = Clock.system(zoneSingapore); 
		System.out.println("Singapure time"+clockSingapore.instant());

		ZoneId zoneCalcutta = ZoneId.of("Asia/Calcutta");
		Clock clockCalcutta = clockSingapore.withZone(zoneCalcutta);
		System.out.println("Calcutta time"+clockCalcutta.instant());
	}
}
