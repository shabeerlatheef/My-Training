package samplemavenproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Date {

	public static void main(String[] args) {  
	    LocalDate date = LocalDate.now();  
	    LocalDate yesterday = date.minusDays(1);  
	    LocalDate tomorrow = yesterday.plusDays(2);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    
	    LocalDate date1 = LocalDate.of(2017, 1, 13);  
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println(date2.isLeapYear());
	    
	    LocalTime time = LocalTime.now();  
	    System.out.println(time);  
	    
	    
	    LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time);  
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);  
	    
	    
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time11 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time11);  
	    LocalTime time21 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time21);  
	    long hours = ChronoUnit.HOURS.between(time11, time21);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time11, time21);  
	    System.out.println("Minutes between two time zone: "+minutes);
	  }  

}
