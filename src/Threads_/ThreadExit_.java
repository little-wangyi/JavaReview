package Threads_;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();

        Thread.sleep(10*1000);
        a.setLoop(false);
        System.out.println("主线程结束");
    }
}

class A implements Runnable{
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while(loop){
            System.out.println("AA---"+Thread.currentThread().getName()+":"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}