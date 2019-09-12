package co.avisek;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.PrintWriter;

public class Program01 {

	public static void main(String[] args) throws Exception {
		
		//PrintWriter w = new PrintWriter(new FileWriter("new info.txt"));
		
		//w.println(20);
		//w.println(100.45);
		//w.println(1.2);
		
		//w.close();
		//System.out.println("Done");
		
		
		
		FileOutputStream file = new FileOutputStream("number.data");
		BufferedOutputStream bfr = new BufferedOutputStream(file);
		DataOutputStream d = new DataOutputStream(bfr); //used for writing double values best practice
		
		
		d.writeDouble(12.3);
		d.writeDouble(1.2e-5);//output will be garbage not numbers because it is not a text file data file
		
		
		d.close();
		bfr.close();//necessary
		file.close();
		System.out.println("done");
		
	}
	
}
