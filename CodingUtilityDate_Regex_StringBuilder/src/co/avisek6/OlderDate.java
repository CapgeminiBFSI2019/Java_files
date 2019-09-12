package co.avisek6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OlderDate {
	
	
	public static String findOlderDate(String dt1,String dt2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse(dt1);
        Date date2 = sdf.parse(dt2);

      SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        if (date1.compareTo(date2) > 0) {
           return sd.format(date2);
        } else if (date1.compareTo(date2) < 0) {
            return sd.format(date1);
        } else return null;
            
}
	
	public static void main(String[] args) throws ParseException {
		
		
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] inp=input.split(" ");
		
		if(findOlderDate(inp[0], inp[1])==null) {
			System.out.println("Dates are same");
		}else System.out.println(findOlderDate(inp[0], inp[1]));
		
		
		
		
	}
	
	
	
}
