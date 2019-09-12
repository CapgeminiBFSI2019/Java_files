package co.avisek;

public class Parsing {
	
	
	public static void main(String[] args) {
		
		
		
		//primitive: byte, short, int, long, double, float, char, boolean
		//wrapper class: Byte, Short, Integer, Long, Double, Float, Boolean
		
		String st= "10001";
		int num = Integer.parseInt(st);// converts string to integ
		System.out.println(num);
		
		
		st="abc123";//hexadecimal format
		int n = Integer.parseInt(st,16);
		System.out.println(n);
		
		
		num = 1992233;
		System.out.println(Integer.toHexString(num));// converts to hexadecimal format
		System.out.println(Integer.toBinaryString(num));//converts to binary format
		
		
		
	}
	
	

}
