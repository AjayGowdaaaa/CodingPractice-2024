package com.threads;

class Counter {
	int count;

	public synchronized void increment() {
		count++;

	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		c.increment();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}

			}
		});
		t1.start();
		t2.start();
//		Both t1 and t2 accessing increment method at same time and causing issue
//		If I declare increment() with synchronized this issue will be resolved
//		t2 will wait to t1 to complete the  accessing increment()

		t1.join();
		t2.join();
		System.out.println("Count ---> " + c.count);

	}

}
