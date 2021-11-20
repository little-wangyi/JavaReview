package IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy {
    @Test
    public void copy() {
        String filePath = "/home/humblee/a.txt";
        String fileCopyPath = "/home/humblee/copy.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buffers = new byte[1024];
        int read = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(fileCopyPath);
            try {
                while((read = fileInputStream.read(buffers)) != -1){
                    fileOutputStream.write(buffers,0,read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
