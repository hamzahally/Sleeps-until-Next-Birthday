import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class App {
	// Input date of birth. Calculate and display how many sleeps until next
	// birthday.

	public static void main(String[] args) {

		int day;
		int month;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter DAY of Birth");

		day = input.nextInt();

		System.out.println("Please enter MONTH of Birth");

		month = input.nextInt();

		Date birthDay = new GregorianCalendar(2018, month, day).getTime();

		Date today = new Date();

		long diff = (birthDay.getTime() - today.getTime()) / (1000 * 60 * 60 * 24) - 29;

		if (diff <= 0)
			System.out.println(diff * -1 + 365 + " sleep(s) until next birthday");
		else {
			System.out.println(diff + " sleep(s) until next birthday");
		}

	}
}
