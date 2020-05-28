
class Bank {
	private int sum = 0;

	public synchronized void Sum(int money){
		sum = sum + money;
		System.out.println("The sum is " + sum);
	}


}

//������ʵ�ֽӿ�Runnable
class Cc implements Runnable/*extends Thread*/ {
	private Bank b = new Bank();
	Object obj = new Object();
	//����Runnable�ӿ��е�run����
	public void run(){
		for (int i = 0; i < 3; i++) {
			b.Sum(100);
		}

	}
}

class BankDemo{
	public static void main(String[] args) {

		//ͨ��Runnableʵ���ഴ���̶߳���
		Cc c = new Cc();

		//��Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯��
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		//����Thread���start���������̲߳�����Runnable�ӿ������run����
		t1.start();
		t2.start();
	}
}
