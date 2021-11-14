package Threads_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("(主线程)执行第"+(i+1)+"次");
            if(i==5){
                System.out.println("子线程插入！");
                    //使用了join的话会优先执行该线程，
                    //执行完毕后再回到主线程继续主线程的操作
                    t2.join();
            }
        }
    }
}

class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("(子线程)已经执行了"+(i+1)+"次");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}