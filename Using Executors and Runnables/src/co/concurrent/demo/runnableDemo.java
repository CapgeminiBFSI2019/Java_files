package co.concurrent.demo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class runnableDemo {

	public static void main(String[] args) {
		
		Runnable task=()->System.out.println("Working with Runnable "+Thread.currentThread().getName()); // create a task
		for(int i=0; i<5;i++) {
		new Thread(task).start(); // Problem: it creates new thread each time leading to memory load
		}
		//ExecutorService ex=Executors.newSingleThreadExecutor(); // creates a pool of threads
		ExecutorService ex=Executors.newFixedThreadPool(3); // creates multi tasking threads
		for(int j=0;j<5;j++) {
		ex.execute(task); //no memory load here
		}
		
		ex.shutdown(); // necessary to close the resource
		
		
		
		
		
	}
}
