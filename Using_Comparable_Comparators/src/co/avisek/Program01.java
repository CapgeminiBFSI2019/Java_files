package co.avisek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.avisek.entity.Employee;

public class Program01 {
	static class EmployeeCompareByName implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	static class EmployeeCompareBysalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return Double.compare(o1.getSalary(),o2.getSalary());
		}
		
	}
	public static void main(String[] args) {
		
		
		Employee e1=new Employee(90,"Gugul",25000);
		Employee e2=new Employee(91,"Avisek",75000);
		
		if(e1.compareTo(e2)>0) {
			System.out.println(e2.getName()+" joined earlier than "+e1.getName());
		}else if(e1.compareTo(e2)==0) {
			System.out.println("Both joined on the same time");
		}else {
			System.out.println(e1.getName()+" joined earlier than "+e2.getName());
		}
		
		
		
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(19, "gugul", 45000));
		l.add(new Employee(134, "ulla", 55000));
		l.add(new Employee(191, "avisek", 75000));
		l.add(new Employee(209, "nanda", 85000));
		l.add(new Employee(1, "jabat", 125000));
		
		Collections.sort(l);//natural sorting ascending order as mentioned in the employee class comparable method
		
		for(Employee e:l) {
			System.out.println(e);
		}
		
		System.out.println();
		
		
        Collections.sort(l,new EmployeeCompareByName()); //Sort By name user defined ascending order
		
		for(Employee e:l) {
			System.out.println(e);
		}
		
		System.out.println();
		
		
       Collections.sort(l,new EmployeeCompareBysalary()); //sort By salary user defined ascending order
		
		for(Employee e:l) {
			System.out.println(e);
		}
		
		//another way for user defined comparator (anonymous class object)
		System.out.println();
		
      Collections.sort(l,new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return Double.compare(o1.getSalary(),o2.getSalary());
		}
    	  
	}); //sort By salary user defined ascending order using anonymous class
		
		for(Employee e:l) {
			System.out.println(e);
		}
		
		
		
		
	}

}
