package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		System.out.println("What is your name: ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		System.out.println("Hello "+ text);
		
		input.close();
		

	}

}
