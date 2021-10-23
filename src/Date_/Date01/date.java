package Date_.Date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        System.out.println(date);
        //通过unix时间戳获取当前时间
        Date date1 = new Date(1634958286);
        System.out.println(date1);

        //Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String date2 = sdf.format(date);
        System.out.println(date2);

        //String -> Date
        //parse需要一个异常捕获
        //返回的格式是外国的格式，若要返回的格式如自己所想，可以再作一次sdf.format
        System.out.println(sdf.parse(date2));

    }
}