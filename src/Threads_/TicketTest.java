package Threads_;

public class TicketTest {
    public static void main(String[] args) {
        Ticket1 ticket1 = new Ticket1();
        ticket1.start();
        Ticket2 ticket2 = new Ticket2();
        Thread thread = new Thread(ticket2);
        thread.start();
    }
}

class Ticket1 extends Thread {
    int ticket = 100;
    @Override
    public void run() {
        while (ticket!=0){
            System.out.println("ticket1="+(--ticket));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Ticket2 implements Runnable {
    int ticket=100;

    @Override
    public void run() {
        while (ticket!=0){
            System.out.println("ticket2="+(--ticket));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}