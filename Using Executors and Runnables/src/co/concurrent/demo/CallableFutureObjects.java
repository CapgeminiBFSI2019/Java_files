package co.concurrent.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureObjects {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Callable<String> task=()->{ 
			Thread.sleep(500);
			return new String("Working with Callable "+Thread.currentThread().getName());};
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		
		
	for(int i=0;i<7;i++) {	
		Future<String> f=ex.submit(task); // future object holds the return value of Callable task
		System.out.println(f.get());
	}
		
	ex.shutdown();	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
