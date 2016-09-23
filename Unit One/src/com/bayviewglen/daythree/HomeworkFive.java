package com.bayviewglen.daythree;

public class HomeworkFive {
	public static void main(String[] args){
		int pennies = 1;
		int nickels = 1;
		int dimes = 1;
		int quarters = 1;
		int loonies = 1;
		int toonies = 1;
				
		double p = 0.01;
		double n = 0.05;
		double d = 0.10;
		double q = 0.25;
		double l = 1.00;
		double t = 2.00;
		double sum = (pennies*p)+(nickels*n)+(dimes*d)+(quarters*q)+(loonies*l)+(toonies*t);
		System.out.println(sum);
	}

}
