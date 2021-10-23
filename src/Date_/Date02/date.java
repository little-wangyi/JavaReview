package Date_.Date02;

import com.sun.javafx.binding.StringFormatter;

import java.util.Calendar;

public class date {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        //月是从0开始计算的
        //由于日历类没有组合输出
        //要自己写输出
        String info = year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒";
        System.out.println(info);
    }
}
