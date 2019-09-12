package co.avisek;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Program01 {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("Test.txt");//creates a new file in the same directory as this java source code
		
		
		file.write("My name is avisek\n");
		file.write("This file works.\n");
		file.close();
		
		FileWriter writer = new FileWriter("Test2.txt");
		PrintWriter new_write=new PrintWriter(writer);//this better than file writer and more flexible
		
		new_write.println("My name is avisek.");
		new_write.println();
		new_write.println();
		new_write.print("My age is:");
		new_write.println(23);
		String name="avisek";
		String add="BBSR";
		new_write.printf("My name is %s and i am from %s",name,add);
		
		new_write.close();
		writer.close();
		
	}

}
