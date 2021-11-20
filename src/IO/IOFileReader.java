package IO;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;

public class IOFileReader {

    @Test
    public void copy() {
        String filePath = "/home/humblee/a.txt";
        FileReader fileReader = null;
        int read = 0;
        char[] buffers = new char[1024];
        try {
            fileReader = new FileReader(filePath);
            while ((read = fileReader.read()) != -1){
                //不同于FileInputStream的字节读取
                //fileReader是通过字符进行读取的
                //但是一个字符一个字符的读取太慢，可以通过字符数组的方式(见copy2)
                System.out.print((char)read);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void copy2(){
        String filePath = "/home/humblee/a.txt";
        FileReader fileReader = null;
        int readlen = 0;
        char[] buffers = new char[1024];
        try {
            fileReader = new FileReader(filePath);
            //readlen是通过read(buffers)取出的字符长度，若为-1说明已经读取到文件底部了
            while ((readlen = fileReader.read(buffers)) != -1){
                //不同于FileInputStream的字节读取
                //fileReader是通过字符进行读取的
                //但是一个字符一个字符的读取太慢，可以通过字符数组的方式(见copy2)
                System.out.print(new String(buffers,0,readlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
