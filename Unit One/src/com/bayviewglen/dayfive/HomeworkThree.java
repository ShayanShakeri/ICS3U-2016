package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter five digits: ");
		
		int digit1 =keyboard.nextInt();
		int digit2 =keyboard.nextInt();
		int digit3 =keyboard.nextInt();
		int digit4 =keyboard.nextInt();
		int digit5 =keyboard.nextInt();
		
		int product = digit2 * digit4;
		
		System.out.println("The product of the second and fourth digit is: "+ product);
		
		keyboard.close();
		
		
		
		
	
	}

}
