package co.avisek;

import java.util.PriorityQueue;

import co.avisek.entity.Employee;

public class PriorityQueue02 {
	public static void main(String[] args) {
		
		
		PriorityQueue<Employee>pq=new PriorityQueue<Employee>();
		pq.offer(new Employee("Scott", 4000.0));
		pq.offer(new Employee("Naomi", 3000.0));
		pq.offer(new Employee("Miley", 6000.0));
		pq.offer(new Employee("Cyrus", 5000.0));
		
		System.out.println(pq.peek());//the lowest according to natural comparison will be the highest priority
		
		Employee e=new Employee("john", 2000.0);
		System.out.println(pq.contains(e));
		
		System.out.println(pq.poll());//remove the highest priority object
		System.out.println(pq);//print the rest
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
