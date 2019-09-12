package co.avisek;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileBufferRead {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter path here:");
		String path= scan.nextLine();
		
		FileReader reader = new FileReader(path);
		
		BufferedReader bfr = new BufferedReader(reader);
		String line;
		while((line=bfr.readLine())!=null) { //reads lines instead of character much faster//gives null if there is no line to read
			System.out.println(line);
			
		}
		bfr.close();//necessary
		reader.close();
		scan.close();
		
		
		
	}
	
	
	
}
