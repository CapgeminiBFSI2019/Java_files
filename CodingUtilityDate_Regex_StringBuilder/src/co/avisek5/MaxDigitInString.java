package co.avisek5;

import java.util.Scanner;

public class MaxDigitInString {
	
	
	public static int getMaxDigit(String line) {
		line = line.replaceAll("[^\\d.]", "");
		if(line.length()==0) {
			return -1;
		}
		int max = Character.getNumericValue(line.charAt(0));
		for (int i = 1; i < line.length(); i++) {
		    int compare = Character.getNumericValue(line.charAt(i));
		    if (max < compare) {
		        max = compare;
		    }
		}
		return max;
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input=input.replaceAll(" ", "");
		
		if(getMaxDigit(input)==-1) {
			System.out.println("No digits in string");
		}else {System.out.println("Max digit : "+getMaxDigit(input));}
		scan.close();
		
		
	}
	
	
	
	
}
