package com.currentthreadname;

public class CurrentThreadName {

	public static void main(String[] args) {
		
		//currentThread()����ֵ��Thread�����ã��������ָ��Thread���ʵ�����ǡ�ִ�е�ǰ������̡߳�
		Thread thread = Thread.currentThread(); 
		System.out.println("��ǰ�̵߳������ǣ�" + thread.getName());
		ShowCurrentThreadName currentthread = new ShowCurrentThreadName();
		currentthread.start();

	}

}
