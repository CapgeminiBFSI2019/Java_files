package co.avisek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FilePrintBufferWriter {
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		
		FileWriter w= new FileWriter("Newfile.txt");
		BufferedWriter bf = new BufferedWriter(w);//Give better performance
		PrintWriter p = new PrintWriter(bf);
		
		p.print("My age is : ");
		p.println(23);
		
		p.close();
		bf.close();//this method writes everything from buffer to file write w
		w.close();
		
		
	}

}
