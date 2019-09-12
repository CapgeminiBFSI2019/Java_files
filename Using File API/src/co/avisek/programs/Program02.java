package co.avisek.programs;

import java.io.File;
import java.util.Scanner;

public class Program02 {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file directory:");
		String filename = scan.nextLine();
		
		File file = new File(filename);//create a file from user input
		
		if(!file.isDirectory()) {//check if the input is a valid directory or not
			System.out.println("Input is not a directory");
			scan.close();
			return;
		}
		File[] files = file.listFiles();//list the content of the directory in an array
		for(File f:files) {
			System.out.printf("[%s] %s\n", f.isDirectory()?"Dir":"File",f.getName());//check whether it is file or directory
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
