package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat formatter = new DecimalFormat("00.000");          // creates a format for rounding to three decimal places

		DecimalFormat formatter2 = new DecimalFormat("00");             // creates a format to make sure that the minutes come out as two digits even if its a single digit number

		final int SECONDS_PER_MINUTE = 60;

		System.out.print("Please enter your first and last name: ");

		String name = input.nextLine();
		String firstName = (name.split(" ")[0]);
		String lastName = (name.split(" ")[1]);
		String namef = lastName + ", " + firstName;						// split the name into first and last, splits around the space

		System.out.print("Please enter your time to the end of the first mile in the format (mm:ss.ss): ");
		String mileOne = input.nextLine();

		System.out.print("Please enter your time to the end of the second mile in the format (mm:ss.ss): ");
		String mileTwo = input.nextLine();

		System.out.print("Please enter your time to the end of the 5km in the format (mm:ss.ss): ");
		String finalTime = input.nextLine();

		int minutesMileOne = Integer.parseInt(mileOne.split(":")[0]);

		double secondsMileOne = Double.parseDouble(mileOne.split(":")[1]);
		double mileOneSeconds = ((minutesMileOne * SECONDS_PER_MINUTE) + secondsMileOne);			// these four lines change the (mm:ss.sss) format into seconds
		String splitOne = mileOne;

		int minutesMileTwo = Integer.parseInt(mileTwo.split(":")[0]);
		double secondsMileTwo = Double.parseDouble(mileTwo.split(":")[1]);
		double timeMileTwo = ((minutesMileTwo * SECONDS_PER_MINUTE) + secondsMileTwo);
		double mileTwoSeconds = (timeMileTwo - mileOneSeconds);
		int splitTwoMinutes = (int) (mileTwoSeconds / SECONDS_PER_MINUTE);				// next five lines convert the full seconds into two separate numbers
		String splitTwoMinutesF = formatter2.format(splitTwoMinutes);
		int splitTwoMinutesSeconds = splitTwoMinutes * SECONDS_PER_MINUTE;
		double splitTwoSeconds = mileTwoSeconds - splitTwoMinutesSeconds;
		String splitTwoSecondsF = formatter.format(splitTwoSeconds);
		String splitTwo = (splitTwoMinutesF + ":" + splitTwoSecondsF);					// the two numbers are combined and turned into a string into the original format of (mm:ss.sss)

		// Rest of code just repeats the same thing

		int minutesFinalTime = Integer.parseInt(finalTime.split(":")[0]);
		double secondsFinalTime = Double.parseDouble(finalTime.split(":")[1]);
		double timeFivekm = ((minutesFinalTime * SECONDS_PER_MINUTE) + secondsFinalTime);
		double finalTimeSeconds = (timeFivekm - timeMileTwo);
		int splitThreeMinutes = (int) (finalTimeSeconds / SECONDS_PER_MINUTE);
		String splitThreeMinutesF = formatter2.format(splitThreeMinutes);
		int splitThreeMinutesSeconds = splitThreeMinutes * SECONDS_PER_MINUTE;
		double splitThreeSeconds = finalTimeSeconds - splitThreeMinutesSeconds;
		String splitThreeSecondsF = formatter.format(splitThreeSeconds);
		String splitThree = (splitThreeMinutesF + ":" + splitThreeSecondsF);

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println();
		System.out.println("Runner: " + lastName + ", " + firstName);
		System.out.println("Split One: " + splitOne);
		System.out.println("Split Two: " + splitTwo);
		System.out.println("Split Three: " + splitThree);
		System.out.println("Finish Time: " + finalTime);
		System.out.println();

		// ------------------------------------------------------------------------------

		System.out.print("Please enter your first and last name: ");

		String name1 = input.nextLine();
		String firstName1 = (name1.split(" ")[0]);
		String lastName1 = (name1.split(" ")[1]);
		String namef1 = lastName1 + ", " + firstName1;

		System.out.print("Please enter your time to the end of the first mile in the format (mm:ss.ss): ");
		String mileOne1 = input.nextLine();

		System.out.print("Please enter your time to the end of the second mile in the format (mm:ss.ss): ");
		String mileTwo1 = input.nextLine();

		System.out.print("Please enter your time to the end of the 5km in the format (mm:ss.ss): ");
		String finalTime1 = input.nextLine();

		int minutesMileOne1 = Integer.parseInt(mileOne1.split(":")[0]);
		double secondsMileOne1 = Double.parseDouble(mileOne1.split(":")[1]);
		double mileOneSeconds1 = ((minutesMileOne1 * SECONDS_PER_MINUTE) + secondsMileOne1);
		String splitOne1 = mileOne1;

		int minutesMileTwo1 = Integer.parseInt(mileTwo1.split(":")[0]);
		double secondsMileTwo1 = Double.parseDouble(mileTwo1.split(":")[1]);
		double timeMileTwo1 = ((minutesMileTwo1 * SECONDS_PER_MINUTE) + secondsMileTwo1);
		double mileTwoSeconds1 = (timeMileTwo1 - mileOneSeconds1);
		int splitTwoMinutes1 = (int) (mileTwoSeconds1 / SECONDS_PER_MINUTE);
		String splitTwoMinutesF1 = formatter2.format(splitTwoMinutes1);
		int splitTwoMinutesSeconds1 = splitTwoMinutes1 * SECONDS_PER_MINUTE;
		double splitTwoSeconds1 = mileTwoSeconds1 - splitTwoMinutesSeconds1;
		String splitTwoSecondsF1 = formatter.format(splitTwoSeconds1);
		String splitTwo1 = (splitTwoMinutesF1 + ":" + splitTwoSecondsF1);

		int minutesFinalTime1 = Integer.parseInt(finalTime1.split(":")[0]);
		double secondsFinalTime1 = Double.parseDouble(finalTime1.split(":")[1]);
		double timeFivekm1 = ((minutesFinalTime1 * SECONDS_PER_MINUTE) + secondsFinalTime1);
		double finalTimeSeconds1 = (timeFivekm1 - timeMileTwo1);
		int splitThreeMinutes1 = (int) (finalTimeSeconds1 / SECONDS_PER_MINUTE);
		String splitThreeMinutesF1 = formatter2.format(splitThreeMinutes1);
		int splitThreeMinutesSeconds1 = splitThreeMinutes1 * SECONDS_PER_MINUTE;
		double splitThreeSeconds1 = finalTimeSeconds1 - splitThreeMinutesSeconds1;
		String splitThreeSecondsF1 = formatter.format(splitThreeSeconds1);
		String splitThree1 = (splitThreeMinutesF1 + ":" + splitThreeSecondsF1);

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println();
		System.out.println("Runner: " + lastName1 + ", " + firstName1);
		System.out.println("Split One: " + splitOne1);
		System.out.println("Split Two: " + splitTwo1);
		System.out.println("Split Three: " + splitThree1);
		System.out.println("Finish Time: " + finalTime1);
		System.out.println();

		// ------------------------------------------------------------------------------

		System.out.print("Please enter your first and last name: ");

		String name11 = input.nextLine();
		String firstName11 = (name11.split(" ")[0]);
		String lastName11 = (name11.split(" ")[1]);
		String namef11 = lastName11 + ", " + firstName11;

		System.out.print("Please enter your time to the end of the first mile in the format (mm:ss.ss): ");
		String mileOne11 = input.nextLine();

		System.out.print("Please enter your time to the end of the second mile in the format (mm:ss.ss): ");
		String mileTwo11 = input.nextLine();

		System.out.print("Please enter your time to the end of the 5km in the format (mm:ss.ss): ");
		String finalTime11 = input.nextLine();

		int minutesMileOne11 = Integer.parseInt(mileOne11.split(":")[0]);
		double secondsMileOne11 = Double.parseDouble(mileOne11.split(":")[1]);
		double mileOneSeconds11 = ((minutesMileOne11 * SECONDS_PER_MINUTE) + secondsMileOne11);
		String splitOne11 = mileOne11;

		int minutesMileTwo11 = Integer.parseInt(mileTwo11.split(":")[0]);
		double secondsMileTwo11 = Double.parseDouble(mileTwo11.split(":")[1]);
		double timeMileTwo11 = ((minutesMileTwo11 * SECONDS_PER_MINUTE) + secondsMileTwo11);
		double mileTwoSeconds11 = (timeMileTwo11 - mileOneSeconds11);
		int splitTwoMinutes11 = (int) (mileTwoSeconds11 / SECONDS_PER_MINUTE);
		String splitTwoMinutesF11 = formatter2.format(splitTwoMinutes11);
		int splitTwoMinutesSeconds11 = splitTwoMinutes11 * SECONDS_PER_MINUTE;
		double splitTwoSeconds11 = mileTwoSeconds11 - splitTwoMinutesSeconds11;
		String splitTwoSecondsF11 = formatter.format(splitTwoSeconds11);
		String splitTwo11 = (splitTwoMinutesF11 + ":" + splitTwoSecondsF11);

		int minutesFinalTime11 = Integer.parseInt(finalTime11.split(":")[0]);
		double secondsFinalTime11 = Double.parseDouble(finalTime11.split(":")[1]);
		double timeFivekm11 = ((minutesFinalTime11 * SECONDS_PER_MINUTE) + secondsFinalTime11);
		double finalTimeSeconds11 = (timeFivekm11 - timeMileTwo11);
		int splitThreeMinutes11 = (int) (finalTimeSeconds11 / SECONDS_PER_MINUTE);
		String splitThreeMinutesF11 = formatter2.format(splitThreeMinutes11);
		int splitThreeMinutesSeconds11 = splitThreeMinutes11 * SECONDS_PER_MINUTE;
		double splitThreeSeconds11 = finalTimeSeconds11 - splitThreeMinutesSeconds11;
		String splitThreeSecondsF11 = formatter.format(splitThreeSeconds11);
		String splitThree11 = (splitThreeMinutesF11 + ":" + splitThreeSecondsF11);

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println();
		System.out.println("Runner: " + lastName11 + ", " + firstName11);
		System.out.println("Split One: " + splitOne11);
		System.out.println("Split Two: " + splitTwo11);
		System.out.println("Split Three: " + splitThree11);
		System.out.println("Finish Time: " + finalTime11);
		System.out.println();

		// ------------------------------------------------------------------------------

		System.out.print("Please enter your first and last name: ");

		String name111 = input.nextLine();
		String firstName111 = (name111.split(" ")[0]);
		String lastName111 = (name111.split(" ")[1]);
		String namef111 = lastName111 + ", " + firstName111;

		System.out.print("Please enter your time to the end of the first mile in the format (mm:ss.ss): ");
		String mileOne111 = input.nextLine();

		System.out.print("Please enter your time to the end of the second mile in the format (mm:ss.ss): ");
		String mileTwo111 = input.nextLine();

		System.out.print("Please enter your time to the end of the 5km in the format (mm:ss.ss): ");
		String finalTime111 = input.nextLine();

		int minutesMileOne111 = Integer.parseInt(mileOne111.split(":")[0]);
		double secondsMileOne111 = Double.parseDouble(mileOne111.split(":")[1]);
		double mileOneSeconds111 = ((minutesMileOne111 * SECONDS_PER_MINUTE) + secondsMileOne111);
		String splitOne111 = mileOne111;

		int minutesMileTwo111 = Integer.parseInt(mileTwo111.split(":")[0]);
		double secondsMileTwo111 = Double.parseDouble(mileTwo111.split(":")[1]);
		double timeMileTwo111 = ((minutesMileTwo111 * SECONDS_PER_MINUTE) + secondsMileTwo111);
		double mileTwoSeconds111 = (timeMileTwo111 - mileOneSeconds111);
		int splitTwoMinutes111 = (int) (mileTwoSeconds111 / SECONDS_PER_MINUTE);
		String splitTwoMinutesF111 = formatter2.format(splitTwoMinutes111);
		int splitTwoMinutesSeconds111 = splitTwoMinutes111 * SECONDS_PER_MINUTE;
		double splitTwoSeconds111 = mileTwoSeconds111 - splitTwoMinutesSeconds111;
		String splitTwoSecondsF111 = formatter.format(splitTwoSeconds111);
		String splitTwo111 = (splitTwoMinutesF111 + ":" + splitTwoSecondsF111);

		int minutesFinalTime111 = Integer.parseInt(finalTime111.split(":")[0]);
		double secondsFinalTime111 = Double.parseDouble(finalTime111.split(":")[1]);
		double timeFivekm111 = ((minutesFinalTime111 * SECONDS_PER_MINUTE) + secondsFinalTime111);
		double finalTimeSeconds111 = (timeFivekm111 - timeMileTwo111);
		int splitThreeMinutes111 = (int) (finalTimeSeconds111 / SECONDS_PER_MINUTE);
		String splitThreeMinutesF111 = formatter2.format(splitThreeMinutes111);
		int splitThreeMinutesSeconds111 = splitThreeMinutes111 * SECONDS_PER_MINUTE;
		double splitThreeSeconds111 = finalTimeSeconds111 - splitThreeMinutesSeconds111;
		String splitThreeSecondsF111 = formatter.format(splitThreeSeconds111);
		String splitThree111 = (splitThreeMinutesF111 + ":" + splitThreeSecondsF111);

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println();
		System.out.println("Runner: " + lastName111 + ", " + firstName111);
		System.out.println("Split One: " + splitOne111);
		System.out.println("Split Two: " + splitTwo111);
		System.out.println("Split Three: " + splitThree111);
		System.out.println("Finish Time: " + finalTime111);
		System.out.println();

		// ------------------------------------------------------------------------------

		System.out.print("Please enter your first and last name: ");

		String name1111 = input.nextLine();
		String firstName1111 = (name1111.split(" ")[0]);
		String lastName1111 = (name1111.split(" ")[1]);
		String namef1111 = lastName1111 + ", " + firstName1111;

		System.out.print("Please enter your time to the end of the first mile in the format (mm:ss.ss): ");
		String mileOne1111 = input.nextLine();

		System.out.print("Please enter your time to the end of the second mile in the format (mm:ss.ss): ");
		String mileTwo1111 = input.nextLine();

		System.out.print("Please enter your time to the end of the 5km in the format (mm:ss.ss): ");
		String finalTime1111 = input.nextLine();

		int minutesMileOne1111 = Integer.parseInt(mileOne1111.split(":")[0]);
		double secondsMileOne1111 = Double.parseDouble(mileOne1111.split(":")[1]);
		double mileOneSeconds1111 = ((minutesMileOne1111 * SECONDS_PER_MINUTE) + secondsMileOne1111);
		String splitOne1111 = mileOne1111;

		int minutesMileTwo1111 = Integer.parseInt(mileTwo1111.split(":")[0]);
		double secondsMileTwo1111 = Double.parseDouble(mileTwo1111.split(":")[1]);
		double timeMileTwo1111 = ((minutesMileTwo1111 * SECONDS_PER_MINUTE) + secondsMileTwo1111);
		double mileTwoSeconds1111 = (timeMileTwo1111 - mileOneSeconds1111);
		int splitTwoMinutes1111 = (int) (mileTwoSeconds1111 / SECONDS_PER_MINUTE);
		String splitTwoMinutesF1111 = formatter2.format(splitTwoMinutes1111);
		int splitTwoMinutesSeconds1111 = splitTwoMinutes1111 * SECONDS_PER_MINUTE;
		double splitTwoSeconds1111 = mileTwoSeconds1111 - splitTwoMinutesSeconds1111;
		String splitTwoSecondsF1111 = formatter.format(splitTwoSeconds1111);
		String splitTwo1111 = (splitTwoMinutesF1111 + ":" + splitTwoSecondsF1111);

		int minutesFinalTime1111 = Integer.parseInt(finalTime1111.split(":")[0]);
		double secondsFinalTime1111 = Double.parseDouble(finalTime1111.split(":")[1]);
		double timeFivekm1111 = ((minutesFinalTime1111 * SECONDS_PER_MINUTE) + secondsFinalTime1111);
		double finalTimeSeconds1111 = (timeFivekm1111 - timeMileTwo1111);
		int splitThreeMinutes1111 = (int) (finalTimeSeconds1111 / SECONDS_PER_MINUTE);
		String splitThreeMinutesF1111 = formatter2.format(splitThreeMinutes1111);
		int splitThreeMinutesSeconds1111 = splitThreeMinutes1111 * SECONDS_PER_MINUTE;
		double splitThreeSeconds1111 = finalTimeSeconds1111 - splitThreeMinutesSeconds1111;
		String splitThreeSecondsF1111 = formatter.format(splitThreeSeconds1111);
		String splitThree1111 = (splitThreeMinutesF1111 + ":" + splitThreeSecondsF1111);

		System.out.println();
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println();
		System.out.println("Runner: " + lastName1111 + ", " + firstName1111);
		System.out.println("Split One: " + splitOne1111);
		System.out.println("Split Two: " + splitTwo1111);
		System.out.println("Split Three: " + splitThree1111);
		System.out.println("Finish Time: " + finalTime1111);
		System.out.println();

		String format = "%1s %15s %15s %15s %15s \n";											// creates a format to space strings out to make a table
		System.out.println("**********************************************************************");
		System.out.println("Cross Country Results");
		System.out.printf(format, "Runner", "Split One", "Split Two", "Split Three", "Finish Time");
		System.out.printf(format, namef, splitOne, splitTwo, splitThree, finalTime);
		System.out.printf(format, namef1, splitOne1, splitTwo1, splitThree1, finalTime1);
		System.out.printf(format, namef11, splitOne11, splitTwo11, splitThree11, finalTime11);
		System.out.printf(format, namef111, splitOne111, splitTwo111, splitThree111, finalTime111);
		System.out.printf(format, namef1111, splitOne1111, splitTwo1111, splitThree1111, finalTime1111);
		System.out.println("**********************************************************************");

		input.close();

	}

}
