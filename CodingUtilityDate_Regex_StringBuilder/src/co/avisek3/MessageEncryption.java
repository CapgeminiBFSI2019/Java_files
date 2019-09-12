package co.avisek3;

import java.util.Scanner;

public class MessageEncryption {
    public static String shiftCons(String inputString) {
    	
    	String consonants = "BCDFGHJKLMNPQRSTVWXYZ".toLowerCase();
		String retStr = "";
		inputString = inputString.toLowerCase();
		for(int i=0; i < inputString.length(); i++)
		{
		     char inputChar = inputString.charAt(i);

		     int indexOfCons = consonants.indexOf(inputChar);

		     if (indexOfCons != -1)
		     {
		           indexOfCons++;
		           if (indexOfCons == consonants.length())
		           {
		                indexOfCons = 0;
		           }
		           retStr += consonants.charAt(indexOfCons);
		     }
		     else
		     {
		           retStr += inputChar;
		     }
		}
		return retStr;
    }
	public static String shiftDigit(String inputString) {
		String consonants = "123456789";
		String retStr = "";
		inputString = inputString.toLowerCase();
		for(int i=0; i < inputString.length(); i++)
		{
		     char inputChar = inputString.charAt(i);

		     int indexOfCons = consonants.indexOf(inputChar);

		     if (indexOfCons != -1)
		     {
		           indexOfCons++;
		           if (indexOfCons == consonants.length())
		           {
		                indexOfCons = 0;
		           }
		           retStr += consonants.charAt(indexOfCons);
		     }
		     else
		     {
		           retStr += inputChar;
		     }
		}
		return retStr;
		
	}
	public static int[] noZeroArr(int[] oldarr) {
		
		int targetIndex = 0;
		for( int sourceIndex = 0;  sourceIndex < oldarr.length;  sourceIndex++ )
		{
		    if( oldarr[sourceIndex] != 0 )
		        oldarr[targetIndex++] = oldarr[sourceIndex];
		}
		int[] newArray = new int[targetIndex];
		System.arraycopy( oldarr, 0, newArray, 0, targetIndex );
		return newArray;
		
		
	}
	public static String encrypt(String message) {
		message=message.toLowerCase();

		int[] index= new int[100];
		for (int i = -1; (i = message.indexOf('a', i + 1)) != -1; i++) {index[i]=i;}
		int[] index2= new int[100];
		for (int i = -1; (i = message.indexOf('o', i + 1)) != -1; i++) {index2[i]=i;}
		int[] NewArr1= noZeroArr(index);
		int[] NewArr2= noZeroArr(index2);
		message = message.replaceAll("e", "a");
		
		for(int s:NewArr1){
			char c = message.charAt(s);
			message.replace(c, 'e');
			}

		message = message.replaceAll("u", "o");
		for(int k:NewArr2){
			char l = message.charAt(k);
			message.replace(l, 'u');
			}
		
		message = message.replaceAll("i", "!");
		message = message.replaceAll(" ", "+");
		message = shiftCons(message);
		message = shiftDigit(message);
		message = message.replaceAll("0", "1");
		
		return message;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter String Here:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(encrypt(input));
		scan.close();
		
	}
}
