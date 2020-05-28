//定义类实现接口Runnable
class Ticket implements Runnable/*extends Thread*/ {
	private  int tick = 1000;
	boolean flag = true;

	Object obj = new Object();
	//覆盖Runnable接口中的run方法
	public void run(){
		if (flag) {
			while (true) {
				//同步代码块
				synchronized (obj) { //obj锁
					show();
				}
			}
		} else {
			while (true) {
				show();
			}
		}
	}
	//死锁

	public  synchronized void show() {//this锁
		synchronized (obj) { //obj锁
			if (tick > 0) {
				try {
							//多线程出现安全问题，通过分析、发现、打印0、-1、-2等错票
							//原因：
							//当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，
							// 还没有执行完，另一个线程参与进来执行，导致共享数据的错误。
							Thread.sleep(10);
					} catch (Exception e) {
				}

				System.out.println(Thread.currentThread().getName() + "...show " + tick--);
			}
		}
	}
}

class DeadLockDemo {
	public static void main(String[] args) {

		//通过Thread类简历线程对象
		Ticket t = new Ticket();

		//将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		//调用Thread类的start方法开启线程并调用Runnable接口子类的run方法
		t1.start();
		try {
			Thread.sleep(20);
		} catch (Exception e) { }
		t.flag = false;
		t2.start();
	}
}