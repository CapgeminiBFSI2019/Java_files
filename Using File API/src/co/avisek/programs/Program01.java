package co.avisek.programs;

import java.io.File;

public class Program01 {
	
	
	public static void main(String[] args) {
		
		File file = new File("Sample.txt");
		
		if(file.exists()) {
			System.out.println("The file or directory exist in the mac");
			System.out.println("Path to file is "+file.getAbsolutePath());
		}else 
			{System.out.println("No such file or directory with name = Sample.txt");
			}
		
		
		
	}
	

}
