class Demo extends Thread {
	public void run(){
		for (int i = 0; i < 60; i++) {
			System.out.println("demo run---" + i);
		}
	}
}


class ThreadDemo1{
	 public static void main(String[] args){
		Demo d = new Demo();	//创建一个线程
		d.start();

		for (int i = 0; i < 60; i++) {
			System.out.println("Hello Workd!---" + i);
		}
	}
}

