package IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOInputStream {
    public static void main(String[] args) {

    }
    @Test
    public void readFile1() {
        String file = "/home/humblee/b.txt";
        int readData =0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            while((readData = fileInputStream.read()) != -1){
                //单字节的读入，当遇到中文时会乱码
                System.out.print((char) readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile2() {
        String file = "/home/humblee/b.txt";
        int readData =0;
        FileInputStream fileInputStream = null;
        byte[] buffs = new byte[16];
        try {
            fileInputStream = new FileInputStream(file);
            while((readData = fileInputStream.read(buffs)) != -1){
                //单字节的读入，当遇到中文时会乱码
                System.out.print(new String(buffs,0,readData));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

