package co.concurrent.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleTasksdemo {
	public static void main(String[] args) {
		
		ScheduledExecutorService scx=Executors.newScheduledThreadPool(3);
		
		Runnable task1=()->System.out.println("Running task 1 "+Thread.currentThread().getName());
		Runnable task2=()->System.out.println("Running task 2 "+Thread.currentThread().getName());
		Runnable task3=()->System.out.println("Running task 3 "+Thread.currentThread().getName());
		
		//order doesnt matter time delay does
		
		scx.schedule(task1, 2, TimeUnit.SECONDS);
		scx.schedule(task3, 5, TimeUnit.SECONDS);
		scx.schedule(task2, 7, TimeUnit.SECONDS);
		
		
		
		
	}

}
