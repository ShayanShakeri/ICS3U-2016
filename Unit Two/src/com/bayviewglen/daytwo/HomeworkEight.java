package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word with at least 2 characters: ");
		String txt = input.nextLine();
		
		String txt1 = txt.substring(0,1);
		String txt2 = txt.substring(txt.length()-1);
		
		System.out.println(txt1 + txt2);

	}

}
