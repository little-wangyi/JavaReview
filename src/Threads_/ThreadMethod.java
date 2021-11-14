package Threads_;

public class ThreadMethod {
    public static void main(String[] args) {
        T t = new T();
        t.setName("老王");
        t.setPriority(Thread.MIN_PRIORITY);
//        t.setPriority(Thread.MAX_PRIORITY);
//        t.setPriority(Thread.NORM_PRIORITY);
        t.start();

        //发出中断休眠信号
        t.interrupt();
    }
}
class T extends Thread{
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "在计数：" + i);
            }
            try {
                System.out.println("休眠中");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"获取了中断信号");
//                e.printStackTrace();
            }
        }
    }
}