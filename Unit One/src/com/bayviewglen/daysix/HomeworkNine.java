package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of items you sold: ");
		int sold = keyboard.nextInt();
		
		double pay = 0.27*sold;
		
		System.out.println("Your pay due is $"+pay);

	}

}
