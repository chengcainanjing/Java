//定义类实现接口Runnable
class Ticket implements Runnable/*extends Thread*/ {
	private static int tick = 100;

	Object obj = new Object();
	//覆盖Runnable接口中的run方法
	public void run(){
		while (true) {
			//同步代码块
			synchronized (obj) {
				if (tick > 0) {
					//这是接口实现，不能出现抛异常，只能catch处理
					try {
						//多线程出现安全问题，通过分析、发现、打印0、-1、-2等错票
						//原因：
						//当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，
						// 还没有执行完，另一个线程参与进来执行，导致共享数据的错误。
						Thread.sleep(10);
					} catch (Exception e) {
					}

					System.out.println(Thread.currentThread().getName() + "...sale " + tick--);
				}
			}
		}
	}
}

class ThreadTicketDemo2 {
	public static void main(String[] args) {
		//创建线程
//     Ticket t1 = new Ticket();
//     Ticket t2 = new Ticket();
//     Ticket t3 = new Ticket();
//     Ticket t4 = new Ticket();
//    t1.start();
//    t2.start();
//    t3.start();
//    t4.start();

		//通过Thread类简历线程对象
		Ticket t = new Ticket();

		//将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		//调用Thread类的start方法开启线程并调用Runnable接口子类的run方法
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//    for (int i = 0; i < 60; i++) {
//       System.out.println("Hello Workd!---" + i);
//    }
	}
}