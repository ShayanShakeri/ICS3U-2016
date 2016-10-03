package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter four characters: ");
		String lol = input.nextLine();
		System.out.print("Please enter a word: ");
		String lul = input.nextLine();
		
		String lel = lol.substring(0,2);
		String lulz = lol.substring(2);
		
		String lolz = lel+lul+lulz;
		System.out.println(lolz);
		
		
		
	
		
		

	}

}
