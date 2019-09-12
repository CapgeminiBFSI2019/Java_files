package co.avisek;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidator {
	
	static int validateHexCode(String line) {
		
		Pattern pattern = Pattern.compile("^#{1}[A-F0-9]{6}$");
		Matcher match =pattern.matcher(line);
		if(match.find()) {
		
			return 1;
		}
		return -1;
		
	}
	
	static int validateDecimalCode(String line) {
		String s= "rgb\\((( *0*([1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]) *),){2}( *0*([1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]) *)\\)";
		Pattern pattern1 = Pattern.compile(s);
		Matcher match =pattern1.matcher(line);
		if(match.find()) {
		
			return 1;
		}
		return -1;
	
	}
	
	public static void main(String[] args) {
		
	System.out.println("Enter input here: ");	
	Scanner scan = new Scanner(System.in);
	
	String input =scan.nextLine();
	String[] st= input.split(" ");
	int option =Integer.parseInt(st[0]);
	
	if(option==1) {
		if(validateHexCode(st[1])==1) {
			System.out.println("Valid Code");
		}else {System.out.println("Invalid Code");}
	}
		
	else if(option==2) {
		if(validateDecimalCode(st[1])==1) {
			System.out.println("Valid Code");
		}else {System.out.println("Invalid Code");}
	}
		
	else {System.out.println("Invalid choice");}	
	
	
	scan.close();
	
	}

}
