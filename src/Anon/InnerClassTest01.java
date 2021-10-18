package Anon;

import javafx.scene.control.Cell;

public class InnerClassTest01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        Bell bell = new Bell(){
            @Override
            public void ring() {
                System.out.println("尝试一下罢了，俏丽马");
            }
        };
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了懒猪");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
        cellphone.alarmclock(bell);
    }
}

interface Bell {
    void ring();
}

class Cellphone {
    void alarmclock(Bell bell) {
        bell.ring();
    }
}
