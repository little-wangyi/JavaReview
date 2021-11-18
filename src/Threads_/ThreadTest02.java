package Threads_;

import java.math.BigInteger;

public class ThreadTest02 {
    public static void main(String[] args) {
        card card = new card();
        Thread userA = new Thread(card);
        userA.setName("userA");
        userA.start();
        Thread userB = new Thread(card);
        userB.setName("userB");
        userB.start();
    }
}

class card implements Runnable{
    private int count = 1000000;
    private boolean flag = true;
    public synchronized void getMoney(){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(count >= 1000){
            System.out.println(Thread.currentThread().getName()+"取走1000元"+"，还剩"+(count-1000));
            count -= 1000;
        }else{
            System.out.println("余额不足");
            flag = false;
        }
    }

    @Override
    public void run() {
        while(flag){
            getMoney();
        }
    }
}