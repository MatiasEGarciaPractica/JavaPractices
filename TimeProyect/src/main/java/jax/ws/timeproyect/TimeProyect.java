package jax.ws.timeproyect;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeProyect {

    public static void main(String[] args) {
        
    	System.out.println("-------------------------timeZone UTC, y simpleDateFormat-------------------------------------------" );
    	TimeZone timeZone = TimeZone.getTimeZone("UTC");
    	Calendar calendar = Calendar.getInstance(timeZone);
    	
    	SimpleDateFormat simpleDateFormat = 
    			new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
    	
    	System.out.println("Time zone: " + timeZone.getID());
    	System.out.println("default time zone: " + TimeZone.getDefault().getID());
    	System.out.println();

    	System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
    	System.out.println("Default: " + calendar.getTime());
    	
    	System.out.println();
    	
    	System.out.println("-------------------------timeZone Asia/Kolkata-------------------------------------------" );
    	

		timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		simpleDateFormat.setTimeZone(timeZone);
		String current_date_time =simpleDateFormat.format(calendar.getTime());		
		System.out.println("Asia/Kolkata----"+current_date_time);
		
		System.out.println();
		
		System.out.println("-------------------------LocalDateTime-------------------------------------------" );
		
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println(fechaHoraActual);
		
		System.out.println();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM dd yyyy"); /*The difference between DateTimeFormatter and SimpleDateFormatt is in notion */
		String resultado = formato.format(fechaHoraActual);
		System.out.println(resultado);
		
		System.out.println();
		
		
		formato = DateTimeFormatter.ofPattern("yyyy dd MMMM, HH:mm:ss");
		resultado = formato.format(fechaHoraActual);
		System.out.println(resultado);
		
    }
}
