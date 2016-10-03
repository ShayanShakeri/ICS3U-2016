package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Plese enter a word with at least 2 characters: ");
		String txt = input.nextLine();
		
		String txt1 = txt.substring(0,2);
		
		String txt2 = txt1+txt1+txt1;
		
		System.out.println(txt2);
		
		input.close();

	}

}
