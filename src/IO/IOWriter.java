package IO;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class IOWriter {
    @Test
    public void Writer(){
        String filePath = "/home/humblee/a.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c','d'};
        try {
            //写入模式
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write(chars);
            fileWriter.write("早，小易，今天也是疲惫的一天");
            fileWriter.write(chars,0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //写入结束后一定要close或flush，不然打开文件什么都没有写入
                fileWriter.close();
//                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
