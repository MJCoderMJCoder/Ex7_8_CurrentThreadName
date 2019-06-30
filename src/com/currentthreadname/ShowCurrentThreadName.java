package com.currentthreadname;

class ShowCurrentThreadName extends Thread {
	public void run() {
		System.out.println("这个线程的名字是：" + this.getName());
		Thread thread = Thread.currentThread(); //获得执行当前代码的相应线程，返回当前线程对象的引用
		System.out.println("当前线程的名字是：" + thread.getName());
	}

}
