class Test implements Runnable {
	private boolean flag;

	Test(boolean flag) {
		this.flag = flag;
	}
	public void run() {
		while (true) {
			if (flag) {
				//ͬ�������
				synchronized (MyLock.locka) {
					System.out.println("if MyLock.locka");
					synchronized (MyLock.lockb) {
						System.out.println("if MyLock.lockb");
					}
				}
			} else {
				//synchronized�����У�ʹ�õ��Ƕ���ʹ��MyLock.lockb,����Ϊ����ʹ�þ�̬���󣬿���������.����
				synchronized (MyLock.lockb) {
					System.out.println("else MyLock.lockb");
					synchronized (MyLock.locka) {
						System.out.println("else MyLock.locka");
					}
				}

			}
		}

	}
}

class MyLock {
	static Object locka = new Object();
	static Object lockb = new Object();
}

class DeadLockTest{
	public static void main(String[] args) {
		Test t = new Test(true);

		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));

		t1.start();

		t2.start();
	}
}