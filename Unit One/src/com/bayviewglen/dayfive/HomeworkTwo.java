package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter what the test was out of: ");
		double test = keyboard.nextDouble();
		System.out.print("Please enter your score: ");
		double score = keyboard.nextDouble();
		
		double prcnt = score * 100 / test;
		
		System.out.println("Your score was " + (int)score +"/"+ (int)test + " or " + prcnt +"%");
		
		
		keyboard.close();
		
				
		
		
		
	}

}
