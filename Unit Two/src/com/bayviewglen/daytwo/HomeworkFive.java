package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String txt = input.nextLine();
		
		if(txt.length()>2){
			String newTxt = txt.substring(0, 2);
			System.out.println(newTxt);
		}
		else{ 
			String txt1 = txt.substring(0);
			System.out.println(txt1);
			
		}
		
	
			
		
		
		
		input.close();
		
		
		

	}




	}


