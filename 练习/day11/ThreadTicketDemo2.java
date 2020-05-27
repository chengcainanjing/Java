//������ʵ�ֽӿ�Runnable
class Ticket implements Runnable/*extends Thread*/ {
	private static int tick = 100;

	Object obj = new Object();
	//����Runnable�ӿ��е�run����
	public void run(){
		while (true) {
			//ͬ�������
			synchronized (obj) {
				if (tick > 0) {
					//���ǽӿ�ʵ�֣����ܳ������쳣��ֻ��catch����
					try {
						//���̳߳��ְ�ȫ���⣬ͨ�����������֡���ӡ0��-1��-2�ȴ�Ʊ
						//ԭ��
						//����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣�
						// ��û��ִ���꣬��һ���̲߳������ִ�У����¹������ݵĴ���
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
		//�����߳�
//     Ticket t1 = new Ticket();
//     Ticket t2 = new Ticket();
//     Ticket t3 = new Ticket();
//     Ticket t4 = new Ticket();
//    t1.start();
//    t2.start();
//    t3.start();
//    t4.start();

		//ͨ��Thread������̶߳���
		Ticket t = new Ticket();

		//��Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯��
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		//����Thread���start���������̲߳�����Runnable�ӿ������run����
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//    for (int i = 0; i < 60; i++) {
//       System.out.println("Hello Workd!---" + i);
//    }
	}
}