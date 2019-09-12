package co.avisek8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyRegistrationNumber {

	static int getSum(int n){ 
        int sum; 
        for (sum = 0; n > 0; sum += n % 10, n /= 10); 
        return sum; 
    } 
	
	public static int checkRegistrationNumber(String line) 
	{	
		if(line.length()==0) {
			return -1;
		}
		Pattern pattern = Pattern.compile("^(KA|DL)(0[1-9]|10)[A-Z]{1,2}[1-9][0-9]{3}$");//keep OR in bracket
		Matcher match =pattern.matcher(line);
		String newString = line.substring(line.length()-4);//
		int numOnly=Integer.parseInt(newString);
		
		if(match.find()) {
		if(getSum(getSum(numOnly))==6 || getSum(numOnly)==6) {
			return 1;}
		return 0;}
			
		else return -1;
			
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		if(checkRegistrationNumber(input)==1) {
			System.out.println("Lucky registration number");
		}else if(checkRegistrationNumber(input)==0) {
			System.out.println("Valid registration number");
		}else System.out.println("Invalid registration number");
		
		scan.close();
		
		
	}
	
}
