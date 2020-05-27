class Ticket extends Thread {
	private static int tick = 100;
	public void run(){
		while (true) {
			if (tick > 0) {
				System.out.println(Thread.currentThread().getName() + "...sale " + tick--);
			}
		}
	}
}

class ThreadTicketDemo{
	 public static void main(String[] args){
	 	//创建线程
		 Ticket t1 = new Ticket();
		 Ticket t2 = new Ticket();
		 Ticket t3 = new Ticket();
		 Ticket t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		for (int i = 0; i < 60; i++) {
			System.out.println("Hello Workd!---" + i);
		}
	}
}

