package co.concurrent.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class handlingException {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Callable<String> task =()->{
			throw new NullPointerException("Null reference "+Thread.currentThread().getName());
		};
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		try {
		Future<String> f=ex.submit(task);
		System.out.println(f.get());
		}finally {
		
		ex.shutdown();
		}
	}

}
