class Res {
	String name;
	String sex;
	boolean flag = false;
}

class Input implements Runnable {
	private Res r;
	Input(Res r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		Object obj = new Object();
		while (true) {
			synchronized (r) {
				if (r.flag) wait();
				if (x == 0) {
					r.name = "cc";
					r.sex = "man";
				} else {
					r.name = "Ω˘¿Ÿ";
					r.sex = "≈Æ»À";
				}
				x = (x + 1) % 2;
				r.flag = true;
				notify();
			}
		}
	}
}

class Output implements Runnable {
	private Res r;

	Output(Res r) {
		this.r = r;
	}

	public void run() {
		Object obj = new Object();
		while (true) {
			synchronized (r) {
				if (!r.flag) wait();
				System.out.println(r.name + "..." + r.sex);
				r.flag = false;
				notify();
			}
		}
	}
}


class InputOutputDemo{
	public static void main(String[] args) {
		Res r = new Res();

		Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();
	}
}