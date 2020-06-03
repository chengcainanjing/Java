class stopThread implements Runnable {
    private boolean flag = true;

    public  synchronized void run() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {//捕获到中断异常，执行下面操作
                System.out.println(Thread.currentThread().getName() + "...Exception");
                //使flag变为false，中断while循环
                //flag = false;
            }
            System.out.println(Thread.currentThread().getName() + "...run");
        }
    }

    public void changeFlag() {
        flag = false;
    }
}

class StopThreadDemo {
    public static void main(String[] args) {
        stopThread st = new stopThread();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        //当进程中，只有守护进程时，退出该进程。
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        int num = 0;

        while (true) {
            if (num++ == 60) {
                //st.changeFlag();
                //中断线程，捕获到中断异常
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "..." + num);
        }
        System.out.println("over");
    }
}

