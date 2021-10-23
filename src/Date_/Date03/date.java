package Date_.Date03;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        //获取年月日
        LocalDate ld = LocalDate.now();
        //获取时分秒
        LocalTime lt = LocalTime.now();
        //获取年月日时分秒(3种的使用方式相近，有特殊需求看文档)
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        int year = ldt.getYear();
        int month = ldt.getMonthValue()+1;
        int dayOfMonth = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"+hour+"时"+minute+"分"+second+"秒");

        //若要对格式有要求，使用Date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);

        //时间戳->Date
        Instant now = Instant.now();
        System.out.println(now);

        Date date = Date.from(now);
        System.out.println(date);

        //Date -> 时间戳
        Instant from = date.toInstant();
        System.out.println(from);

        //添加或减少日期
        //例如365天后的日期
        LocalDateTime localDateTime = ldt.plusDays(365);
        System.out.println(dateTimeFormatter.format(localDateTime));

        //例如20天前的日期
        LocalDateTime localDateTime1 = ldt.minusDays(20);
        System.out.println(dateTimeFormatter.format(localDateTime1));
    }
}
