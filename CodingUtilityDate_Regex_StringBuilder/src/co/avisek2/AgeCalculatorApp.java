package co.avisek2;

import java.text.ParseException;
import java.util.Scanner;

public class AgeCalculatorApp {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Enter date in dd/MM/yyyy:");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		AgeCalculator a1 = new AgeCalculator();
		if(a1.calculateAge(line)==null) {
			System.out.println("Invalid date of birth");
		}
		else {
		
		int[] l = a1.calculateAge(line);
		if(l[0]==0) {
			System.out.println("Months : "+l[1]);
		}
		else if(l[1]==0) {
			System.out.println("Years : "+l[0]);
		}
		else{System.out.println("Years : "+l[0]+", Months : "+l[1]);}
		}
		
		scan.close();
		
		
	}

}
