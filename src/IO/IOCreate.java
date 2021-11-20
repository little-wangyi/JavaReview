package IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class IOCreate {
    public static void main(String[] args) {
        String fileName = "/home/humblee/公共的/a.txt";
        File file = new File(fileName);
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createFile2() {
        String parentName = "/home/humblee/";
        File file = new File(parentName, "b.txt");
        try {
            //若调用file.createNewFile()时
            // 原来的此父文件夹下有同名文件会return false
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createFile03() {
        File file = new File("/home/humblee/公共的/");
        File file1 = new File(file, "c.txt");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
