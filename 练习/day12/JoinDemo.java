class Join implements Runnable {

    public   void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread().toString() + "...run" + i);
        }
    }
}

class JoinDemo {
    public static void main(String[] args) throws Exception {
        Join ji = new Join();

        Thread t1 = new Thread(ji);
        Thread t2 = new Thread(ji);

        t1.start();
        t2.start();
        t1.join();

        for (int i = 0; i < 70; i++) {
            System.out.println(Thread.currentThread().getName() + "..." + i);
        }

        System.out.println("over");
    }
}

