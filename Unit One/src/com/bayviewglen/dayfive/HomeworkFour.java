package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Please enter the initial velocity: ");
		double vi = keyboard.nextDouble();
		System.out.print("Please enter the acceleration: ");
		double a = keyboard.nextDouble();
		System.out.print("Please enter the elapsed time: ");
		double t = keyboard.nextDouble();
		
		double vf = vi + (a*t);
		
		System.out.println("The Final Velocity is: "+vf);
		

	}

}
