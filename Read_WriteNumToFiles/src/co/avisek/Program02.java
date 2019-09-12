package co.avisek;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;


public class Program02 {

	
	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream file = new FileInputStream("number.data"); //opens the file data file
		BufferedInputStream bfr = new BufferedInputStream(file);// enhances performance
		DataInputStream in = new DataInputStream(bfr);
		
		
		while(true) {
		     
			try {
			 double d = in.readDouble();//reads from number.data file
		     System.out.println(d);
			}catch(EOFException e) {//throws exception when there is nothing to read
				break;
			}
		
		}
		
		in.close();
		bfr.close();//necessary
		file.close();
		
		
		
	}
}
