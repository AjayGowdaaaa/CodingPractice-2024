package com.threads;

class Hi implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}

class Hello implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}

public class ThreadDemo {

	public static void main(String[] args) {

//		Threads using a implemented class

		Thread hi = new Thread(new Hi());
		Thread hello = new Thread(new Hello());
		hi.start();
		hello.start();



	}

}
