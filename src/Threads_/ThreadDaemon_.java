package Threads_;

public class ThreadDaemon_ {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyDaemonThread());
        //设置守护线程，如果主线程结束，则子线程也结束
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("小c正在努力工作");
            Thread.sleep(500);
        }
    }
}
class MyDaemonThread implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("小A和小B正在聊天");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}