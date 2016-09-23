package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		int num = keyboard.nextInt();
		
		int sqr = (int) Math.pow(num, 2);
		int sqrt = (int) Math.sqrt(num);
		
		System.out.println(+num+" Squared is "+sqr+", and the square root of "+num+" is "+sqrt);
				
				

	}

}
