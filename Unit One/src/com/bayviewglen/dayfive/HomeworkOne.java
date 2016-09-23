package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		double number = keyboard.nextDouble();
		double square = number*number;
		
		System.out.println("The number " + number + " squared is " + square);
		
		keyboard.close();
	}

}
