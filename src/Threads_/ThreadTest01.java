package Threads_;

import org.omg.CORBA.INTERNAL;

import java.util.Random;

public class ThreadTest01 {
    public static void main(String[] args) {
        t1 t = new t1();
        t2 t2 = new t2(t);
        new Thread(t).start();
        new Thread(t2).start();

    }
}

class t1 implements Runnable {
    private int num;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            num = (new Random().nextInt(100));
            System.out.println(num);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class t2 implements Runnable{
    private t1 t;
    @Override
    public void run() {
    while(true){
        if(t.getNum() >= 50){
            t.setFlag(false);
            System.out.println("已经出现大于50的值");
            break;
        }
    }
    }

    public t2(t1 t) {
        this.t = t;
    }
}