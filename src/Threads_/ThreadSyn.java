package Threads_;

public class ThreadSyn {
    public static void main(String[] args) {
        Ticket1 ticket1 = new Ticket1();
        new Thread(ticket1).start();
        new Thread(ticket1).start();
        new Thread(ticket1).start();
    }
}

class Ticket1 implements Runnable {
    private int ticket = 10000;
    private boolean loop = true;

    private synchronized void sell() {
        //也可以同步代码块，不同步方法，效果相同
        // synchronized(this){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售出一张票，还剩下:" + (--ticket) + "张票");
        } else {
            System.out.println("售票结束");
            loop = false;
            return;
        }
//    }
    }
    //但是若要同步静态方法，需要在类上加锁
    private static void m1(){

    }

    private static void m2(){
        synchronized (Ticket1.class){

        }
    }
    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}