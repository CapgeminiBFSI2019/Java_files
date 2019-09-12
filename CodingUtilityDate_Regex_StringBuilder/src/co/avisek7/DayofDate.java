package co.avisek7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayofDate {
	
	public static String getDayOfDate(String date) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date myDate = sdf.parse(date);
		sdf.applyPattern("EEEE");
		String Day = sdf.format(myDate);
		return Day;
		
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		
		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		System.out.println(getDayOfDate(input));
		scan.close();
		
		
		
		
	}

}
