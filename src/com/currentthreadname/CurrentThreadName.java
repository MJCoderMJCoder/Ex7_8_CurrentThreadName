package com.currentthreadname;

public class CurrentThreadName {

	public static void main(String[] args) {
		
		//currentThread()返回值是Thread的引用，这个引用指向Thread类的实例正是“执行当前代码的线程”
		Thread thread = Thread.currentThread(); 
		System.out.println("当前线程的名字是：" + thread.getName());
		ShowCurrentThreadName currentthread = new ShowCurrentThreadName();
		currentthread.start();

	}

}
