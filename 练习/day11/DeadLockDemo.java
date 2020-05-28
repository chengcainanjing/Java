//������ʵ�ֽӿ�Runnable
class Ticket implements Runnable/*extends Thread*/ {
	private  int tick = 1000;
	boolean flag = true;

	Object obj = new Object();
	//����Runnable�ӿ��е�run����
	public void run(){
		if (flag) {
			while (true) {
				//ͬ�������
				synchronized (obj) { //obj��
					show();
				}
			}
		} else {
			while (true) {
				show();
			}
		}
	}
	//����

	public  synchronized void show() {//this��
		synchronized (obj) { //obj��
			if (tick > 0) {
				try {
							//���̳߳��ְ�ȫ���⣬ͨ�����������֡���ӡ0��-1��-2�ȴ�Ʊ
							//ԭ��
							//����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣�
							// ��û��ִ���꣬��һ���̲߳������ִ�У����¹������ݵĴ���
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

		//ͨ��Thread������̶߳���
		Ticket t = new Ticket();

		//��Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯��
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		//����Thread���start���������̲߳�����Runnable�ӿ������run����
		t1.start();
		try {
			Thread.sleep(20);
		} catch (Exception e) { }
		t.flag = false;
		t2.start();
	}
}