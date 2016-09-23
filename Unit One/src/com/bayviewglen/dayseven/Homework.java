package com.bayviewglen.dayseven;

public class Homework {

	static final int MINUTES_PER_HOUR = 60;
	static final int HOURS_PER_DAY = 24;
	static final int DAYS_PER_YEAR = 365;
	
	public static void main(String[] args) {
		
		int minutesPerYear = DAYS_PER_YEAR * HOURS_PER_DAY * MINUTES_PER_HOUR;
		
		System.out.println("The number of minutes in a year is " + minutesPerYear);

	}

}
