package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String a = input.nextLine();
		System.out.print("Please enter another word: ");
		String b = input.nextLine();
		
		String mix = a+b+b+a;
		
		System.out.println(mix);
		
		input.close();

	}

}
