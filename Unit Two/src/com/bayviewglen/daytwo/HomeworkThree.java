package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a tag: ");
		String tag = input.nextLine();
		System.out.print("Please enter a phrase: ");
		String phrase = input.nextLine();
		
		String lel = "<"+tag+">"+phrase+"</"+tag+">";
		
		System.out.println(lel);
		

	}

}
