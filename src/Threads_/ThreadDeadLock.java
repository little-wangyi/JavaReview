package Threads_;

public class ThreadDeadLock extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public ThreadDeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入o1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入o2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入o1");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入o2");
                }
            }
        }
    }

    public static void main(String[] args) {
        //不一定每次都触发死锁
        new ThreadDeadLock(true).start();
        new ThreadDeadLock(false).start();
    }
}