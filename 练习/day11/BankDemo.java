
class Bank {
	private int sum = 0;

	public synchronized void Sum(int money){
		sum = sum + money;
		System.out.println("The sum is " + sum);
	}


}

//定义类实现接口Runnable
class Cc implements Runnable/*extends Thread*/ {
	private Bank b = new Bank();
	Object obj = new Object();
	//覆盖Runnable接口中的run方法
	public void run(){
		for (int i = 0; i < 3; i++) {
			b.Sum(100);
		}

	}
}

class BankDemo{
	public static void main(String[] args) {

		//通过Runnable实现类创建线程对象
		Cc c = new Cc();

		//将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		//调用Thread类的start方法开启线程并调用Runnable接口子类的run方法
		t1.start();
		t2.start();
	}
}
