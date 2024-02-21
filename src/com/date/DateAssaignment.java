package com.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * 10. Write a Java program to get seconds since 1970
 * 11. Write a Java program to convert a unix timestamp to date
 * 12. Write a Java program to extract date, time from the date string
 */
public class DateAssaignment {

	public static long getSecondsSince1970() {

		long currentTimeMillis = System.currentTimeMillis();

		long secondsSince1970 = currentTimeMillis / 1000;

		return secondsSince1970;
	}

	public static Date convertUnixToDate(long unixTimestamp) {
		//Coordinated Universal Time (UTC)
		Date date = new Date(unixTimestamp * 1000);
		return date;
	}

	public static LocalDateTime convertStringToDate(String dateString) {
		/*
		 * DateTime formats
		 * yyyy-MM-dd HH:mm:ss, 
		 * yyyy-MM-dd, 
		 * MM/dd/yyyy HH:mm:ss,
		 * MM/dd/yyyy, 
		 * dd-MM-yyyy HH:mm:ss, 
		 * dd-MM-yyyy
		 */

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
		return dateTime;
	}

	public static void main(String[] args) {

		long secondsSince1970 = getSecondsSince1970();

		System.out.println("Seconds since 1970: "+ secondsSince1970);

		System.out.println(convertUnixToDate(secondsSince1970));

		System.out.println(convertStringToDate("2024-02-20 14:30:00"));
		


	}
	
}
