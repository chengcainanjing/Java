class thread extends Thread {
	private String name;
	thread(String name){
		//this.name = name;
		super(name);
	}


	public void run(){
		for (int i = 0; i < 60; i++) {
			System.out.println(this.getName()+" run---" + i);
		}
	}
}

class ThreadTest{
	 public static void main(String[] args){
	 	//创建线程
		thread t1 = new thread("one---");
		thread t2 = new thread("two---");
		t1.start();
		t2.start();

		for (int i = 0; i < 60; i++) {
			System.out.println("Hello Workd!---" + i);
		}
	}
}

