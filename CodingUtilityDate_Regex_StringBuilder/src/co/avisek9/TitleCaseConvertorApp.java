package co.avisek9;

import java.util.Scanner;

public class TitleCaseConvertorApp {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		TitleCaseConverter t = new TitleCaseConverter();
		System.out.println(t.convert(input));
		scan.close();
		
		
	}

}
