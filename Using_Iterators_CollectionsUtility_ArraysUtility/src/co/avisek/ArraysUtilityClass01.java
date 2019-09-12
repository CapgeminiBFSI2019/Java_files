package co.avisek;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import co.avisek.entity.Employee;

public class ArraysUtilityClass01 {
   
	public static void main(String[] args) {
	
	Employee[] emps= {
		new Employee(7589,"kyle",35000.0),
		new Employee(7389,"ray",22000.0),
		new Employee(7789,"smith",48000.0),
		new Employee(7489,"gugul",70000.0),
		new Employee(7289,"scott",90000.0),
		new Employee(7089,"avisek",81000.0) 
	};
		
	System.out.println(Arrays.toString(emps));//toString function
	
	Employee eMaxSal=Collections.max(Arrays.asList(emps),new Comparator<Employee>() {//convert to ArrayList, use salary comparison function
		public int compare(Employee e1,Employee e2) {
			return Double.compare(e1.getSalary(), e2.getSalary());
		}
	});//convert arrays to list for using collection utilities
	System.out.println();
	System.out.println("Max Salary: "+eMaxSal);
	
	
	System.out.println();
	
	
	//Arrays equals function
	String[] names1= {"john","robert","smith","albert","anthony"};
	String[] names2= {"john","smith","albert","anthony","robert"};
	
	boolean same=Arrays.equals(names1, names2);
	System.out.println(same);
	
	System.out.println();
	
	//Copy function
	
	String[] names3=Arrays.copyOf(names1, 10);//creates new array of length 10
	System.out.println(Arrays.toString(names3));
	
	System.out.println();
	//Sort Arrays
	Arrays.sort(emps);//sort by natural comparison
	for(Employee e:emps) {
		System.out.println(e);//sorted by id
	}
	
	System.out.println();
	//After sorting use search
	
	int index=Arrays.binarySearch(emps, new Employee(2091,null,0.0));
	
	System.out.println(index);//will return negative integer if index not found
	
}
}
