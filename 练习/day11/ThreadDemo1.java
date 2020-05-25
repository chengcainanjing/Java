class Demo extends Thread {
	public void run(){
		for (int i = 0; i < 60; i++) {
			System.out.println("demo run---" + i);
		}
	}
}


class ThreadDemo1{
	class public void main(String[] args){
		Demo d = new Demo();
		d.start();

		for (int i = 0; i < 60; i++) {
			System.out.println("Hello Workd!---" + i);
		}
	}
}

