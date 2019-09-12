package co.avisek4;

import java.util.Scanner;

public class UniqueCharacterCount {
	
	public static int getUniqueCharacters(String s1) {
	    String s2 = s1.toLowerCase();
	    StringBuffer sb = new StringBuffer(s2);
	    int l = sb.length();
	    int count = 0;
	    for (int i = 0; i < l; i++) {
	      count = 0;
	      for (int j = i + 1; j < l; j++) {
	        if (sb.charAt(i) == sb.charAt(j)) {
	          sb.deleteCharAt(j);
	          count++;
	          j--;
	          l--;
	        }
	      }
	      if (count > 0) {
	        sb.deleteCharAt(i);
	        i--;
	        l--;
	      }
	      
	    }
	    return sb.length();
	}
	    

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter here:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input=input.replaceAll(" ", "");
		
		if(getUniqueCharacters(input)!=0) {
			System.out.println(getUniqueCharacters(input)+" unique character/s");
		}
		else {
			System.out.println("No unique character/s");
		}
		scan.close();
		
		
	}
}
