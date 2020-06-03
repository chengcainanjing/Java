class Res {
	String name;
	String sex;
	boolean flag = false;

	public synchronized void set(String name, String sex) {
		if (flag) try {
			this.wait();
		} catch (Exception e) {
		}

		this.sex = sex;
		this.name = name;
		flag = true;
		this.notify();
	}

	public synchronized void out() {
		if (!flag) try {
			this.wait();
		} catch (Exception exception) {
		}

		System.out.println(name + "..." + sex);
		flag = false;
		this.notify();
	}
}

class Input implements Runnable {
	private Res r;
	Input(Res r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) {
				if (x == 0) r.set("cc", "man");
				else r.set("Ω˘¿Ÿ", "≈Æ»À");
				x = (x + 1) % 2;
		}
	}
}

class Output implements Runnable {
	private Res r;

	Output(Res r) {
		this.r = r;
	}

	public void run() {
		while (true) r.out();
	}
}


class InputOutputDemo1{
	public static void main(String[] args) {
		Res r = new Res();

		Thread t1 = new Thread(new Input(r));
		Thread t2  = new Thread(new Output(r));

		t1.start();
		t2.start();
	}
}