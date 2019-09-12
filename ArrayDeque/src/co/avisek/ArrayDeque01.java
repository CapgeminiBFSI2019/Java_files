package co.avisek;

import java.util.ArrayDeque;

public class ArrayDeque01 {
	
	public static void main(String[] args) {
		
		//default capacity of 16 elements
		ArrayDeque<Integer>dq=new ArrayDeque<Integer>();
		//add items to deque
		
		
		dq.offer(100);
		dq.offer(200);
		dq.offer(300);
		dq.offer(400);
		dq.offer(500);
		System.out.println(dq);
		
		dq.offerFirst(66);
		System.out.println(dq);
		
		dq.offerLast(71);
		System.out.println(dq);
		
		
		//get head of the deque
		int head=dq.peek();
		System.out.println(head);
		
		//shows the tail
		System.out.println(dq.peekLast());
		
		System.out.println(dq.poll());//removes the head
		
		System.out.println(dq);
		
		System.out.println(dq.pollLast());//removes the tail
		
		System.out.println(dq);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
