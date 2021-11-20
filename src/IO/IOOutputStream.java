package IO;

import org.junit.jupiter.api.Test;

import java.io.*;

public class IOOutputStream {
    @Test
    public void WriteFile() {
        String path = "/home/humblee/a.txt";
        String str = "hello,humblee";
        FileOutputStream fileOutputStream = null;
        try {
            //1.通过这种方式后续写入的字节，将会覆盖之前该文件的所有内容
//            fileOutputStream = new FileOutputStream(path);
            //2.通过这种方式可以在原来的文件上添加后续字节
            fileOutputStream = new FileOutputStream(path,true);
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
