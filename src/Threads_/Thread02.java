package Threads_;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();

        //模拟代理
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪叫" + (++count)+"---"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
//模拟线程的静态代理
class ThreadProxy implements Runnable{
    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    private Runnable target =null;
    @Override
    public void run() {
        if(target!=null){
            target.run();
        }
    }

    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}

class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("嗷呜叫");
    }
}