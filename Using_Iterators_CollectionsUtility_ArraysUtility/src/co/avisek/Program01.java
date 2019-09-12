package co.avisek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


import co.avisek.entity.Employee;

public class Program01 {
	public static void main(String[] args) {
		
		
		List<Employee> l=new ArrayList<Employee>();
		
		l.add(new Employee(7589,"kyle",35000.0));
		l.add(new Employee(7389,"ray",22000.0));
		l.add(new Employee(7789,"smith",48000.0));
		l.add(new Employee(7489,"gugul",70000.0));
		l.add(new Employee(7289,"scott",90000.0));
		l.add(new Employee(7089,"avisek",81000.0));
		
		
		Iterator<Employee>it=l.iterator();
		while(it.hasNext()) {
			Employee e1=it.next();
			System.out.println(e1);
		}
		
		System.out.println();
		
		//Using comparators
		
		Collections.sort(l, new Comparator<Employee>() {
			public int compare(Employee o1,Employee o2) {
				return o2.getName().compareTo(o1.getName());//prints in reverse order of name change swap o2,o1
			}
		});
		
		for(Employee n:l) {
			System.out.println(n);
		}
		System.out.println();
		
		Collections.sort(l);//sort by natural comparison
		for(Employee o:l) {
			System.out.println(o);
		}
		System.out.println();
		int index=Collections.binarySearch(l, new Employee(7389,"",0.0));//search for index of employee id 7389 in sorted list
		System.out.println("Index: "+index);
		
		//if input data not found it will give a negative number
		index=Collections.binarySearch(l, new Employee(89,"",0.0));
		System.out.println("new index: "+index);
		
		System.out.println();
		Employee min=Collections.min(l);//based on natural comparison already sorted at line 47
		System.out.println(min);
		
		Employee highestEarner=Collections.max(l,new Comparator<Employee>() {//based on user defined comparator
			public int compare(Employee n1,Employee n2) {
				return Double.compare(n1.getSalary(), n2.getSalary());
			}
		});
		
		System.out.println();
		System.out.println("Highest salary: "+highestEarner);
		
		
	}

}
