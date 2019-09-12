package co.avisek;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue01 {
	
	public static void main(String[] args) {
		
	
		
		PriorityQueue<Integer>pQ=new PriorityQueue<Integer>();
		
		System.out.println("Initial size of Queue: "+pQ.size());
		
		pQ.add(500);
		pQ.add(300);
		pQ.add(100);
		pQ.add(400);
		
		
		System.out.println("Size of Queue Now: "+pQ.size());
		
		pQ.offer(600);//use this does'nt throw exception
		System.out.println("Size of Queue after adding: "+pQ.size());
		System.out.println();
		
		Iterator<Integer>it=pQ.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//user order not specified
		}
		
		//print the highest priority element which is the least value 100 FIFO
		System.out.println("Head value: "+pQ.peek());
		
		//retrieving & removing the highest priority element
		System.out.println(pQ.poll());
		
		System.out.println(pQ);
		
		pQ.remove();//removes the next high priority that is the least value 300 FIFO
		//remove method throws exception when queue is null so don't use this
		System.out.println(pQ);
		
		//Check for an element inside the queue
		boolean status=pQ.contains(111);
		System.out.println(status);
		
		
		//creat an array
		Object[] numbers=pQ.toArray();
		System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
