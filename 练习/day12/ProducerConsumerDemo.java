class Res {
	String name;
	int count = 1;
	boolean flag = false;

	public synchronized void set(String name) {
		while (flag) try {
			this.wait();
		} catch (Exception e) {
		}

		this.name = name+"..."+count++;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
		flag = true;
		this.notify();

	}

	public synchronized void out() {
		if(!flag) try {
			this.wait();
		} catch (Exception exception) {
		}

		flag = false;
		System.out.println(Thread.currentThread().getName() + "...消费者......" + this.name);
		this.notify();
	}
}

class Producer implements Runnable {
	private Res r;
	Producer(Res r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		if (true) {
				r.set("自行车");
		}
	}
}

class Consumer implements Runnable {
	private Res r;

	Consumer(Res r) {
		this.r = r;
	}

	public void run() {
		while (true) r.out();
	}
}


class ProducerConsumerDemo{
	public static void main(String[] args) {
		Res r = new Res();

		Thread t1 = new Thread(new Producer(r));
		Thread t2  = new Thread(new Consumer(r));

		t1.start();
		t2.start();
	}
}