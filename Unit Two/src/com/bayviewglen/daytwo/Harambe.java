
package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Harambe {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.print("Please enter your name: ");
				String txt = input.nextLine();
				
				
				if (txt.equals("Salman")||txt.equals("Shayan")||txt.equals("Aadithya")||txt.equals("Roman")||txt.equals("Raaed")||txt.equals("Jory")||txt.equals("Zach")||txt.equals("Zachary")){
					System.out.println("Harambe didn't deserve to die.");
				}
				else{
					System.out.println("That's a nice name.");
				}
					
				input.close();

			}

		

}


