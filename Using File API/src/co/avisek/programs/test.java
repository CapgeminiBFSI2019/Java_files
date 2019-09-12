package co.avisek.programs;

import java.io.*;
public class test {
public static void main(String args[]) {
File inFile = new File("Sample.txt");
FileInputStream fis = null; BufferedInputStream bis = null;
int data;
try {
fis = new FileInputStream(inFile);
bis = new BufferedInputStream(fis);
data = bis.read(); 
System.out.println((char)data);
} catch (FileNotFoundException e) {
System.out.println("File Not Found");
} catch (IOException e) {
e.printStackTrace();
} 
}
}
