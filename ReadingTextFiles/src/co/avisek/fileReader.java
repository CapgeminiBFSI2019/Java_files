package co.avisek;


import java.io.FileReader;
import java.util.Scanner;

public class fileReader {

	public static void main(String[] args) throws Exception {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter path here:");
		String path= scan.nextLine();
		
		FileReader reader = new FileReader(path);//specify the path for reading file
		
		int ch;
		while((ch=reader.read())!=-1) {//check if there is any character to read or not
			System.out.print((char) ch);//change into character
		}
		
		reader.close();
		scan.close();
		
		
		
	}
	
	
	
}
