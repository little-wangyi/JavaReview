package Threads_;


public class Threads01 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        //真正实现多线程的是start()调用的start0()方法
        cat.start();
        //若是单纯的调用run方法的话只是一个串行化方法
//        cat.run();
        //若是直接调用run方法，则会等run()方法结束后，才会进入for循环
        for(int i =0 ;i<50;i++){
            System.out.println("主线程i="+i);
        }
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        int time = 0;
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("喵喵叫"+(++time));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(time == 8){
                break;
            }
        }
    }
}
