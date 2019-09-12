package co.avisek;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
	
		List<String> list= new ArrayList<String>();//this is the ways to initialize lists
		
		list.add("Abhisek");
		list.add("gugul");
		list.add("gaba");
		System.out.println(list);
		list.add(1, "ganduman");
		System.out.println(list);
		list.set(0, "gabura");
		System.out.println(list);
		
		
		
		
	}
}
