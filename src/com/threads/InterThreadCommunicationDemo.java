package com.threads;

class Test {
	int num;
	boolean set = false;

	public synchronized void setNum(int num) {
		while (set) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Setting : " + num);
		this.num = num;
		set = true;
		notify();
	}

	public synchronized void getNum() {
		while (!set) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Getting : " + num);
		set = false;
		notify();
	}

}

class Producer implements Runnable {

	Test test;

	public Producer(Test test) {
		super();
		this.test = test;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			test.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {

	Test test;

	public Consumer(Test test) {
		super();
		this.test = test;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}

	@Override
	public void run() {
		while (true) {
			test.getNum();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {

		Test test = new Test();
		new Consumer(test);
		new Producer(test);

	}

}
