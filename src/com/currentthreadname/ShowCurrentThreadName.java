package com.currentthreadname;

class ShowCurrentThreadName extends Thread {
	public void run() {
		System.out.println("����̵߳������ǣ�" + this.getName());
		Thread thread = Thread.currentThread(); //���ִ�е�ǰ�������Ӧ�̣߳����ص�ǰ�̶߳��������
		System.out.println("��ǰ�̵߳������ǣ�" + thread.getName());
	}

}
