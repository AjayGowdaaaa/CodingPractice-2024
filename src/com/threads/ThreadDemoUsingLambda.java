package com.threads;

public class ThreadDemoUsingLambda {

	public static void main(String[] args) throws InterruptedException {
		// Threads using Lambda expression and Runnable Interface

		Thread obj1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				System.out.println("Current Thread --> "+Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Thread obj2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				System.out.println("Current Thread --> "+Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		obj1.start();
		obj2.start();
		
		System.out.println("Name of the thread "+obj1.getName());
		System.out.println("ID "+ obj1.getId());
		System.out.println("Priority "+obj1.getPriority());
		System.out.println("Group "+obj1.getThreadGroup());
		System.out.println("Name of the thread "+obj2.getName());
		System.out.println("ID "+ obj2.getId());

		// Join will will put the current thread on wait until the thread on which it is
		// called is dead or wait for specified time (milliseconds + nanos).
		
		obj1.join();
		obj2.join();
		System.out.println(obj1.isAlive());

		System.out.println("**************************************************************");
	}
}
