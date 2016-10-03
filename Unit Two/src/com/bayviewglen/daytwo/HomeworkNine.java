package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String txt = input.nextLine();
		System.out.print("Please enter another word of different length: ");
		String txt1 = input.nextLine();
		
		if(txt.length()>txt1.length()){
			String txt2 = txt1+txt+txt1;
			System.out.println(txt2);
	
		}else{
			String txt3 = txt+txt1+txt;
			System.out.println(txt3);
		}
		
		input.close();

	}

}
