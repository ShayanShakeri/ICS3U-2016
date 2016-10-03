package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word with an even number of characters: ");
		String txt = input.nextLine();
		
		if(txt.length()% 2==0){
			String txt1 = txt.substring(0, txt.length()/2);
			System.out.println(txt1);
		}else
			System.out.println("That is not an even word.");
		
		
		input.close();
		

	}

}
