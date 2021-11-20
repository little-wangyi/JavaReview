package IO;

import org.junit.jupiter.api.Test;

import java.io.File;

public class IOMethod {
    public static void main(String[] args) {
        File file = new File("/home/humblee/公共的/c.txt");
        System.out.println("文件名称" + file.getName());
        System.out.println("绝对地址：" + file.getAbsoluteFile());
        System.out.println("是否为目录:" + file.isDirectory());
        System.out.println("是否存在该文件:" + file.exists());
        System.out.println("父文件夹:" + file.getParent());
    }
    @Test
    public void m1() {
        File file = new File("/home/humblee/kong");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("该目录已经删除");
            }
        } else {
            if (file.mkdir()) {
                System.out.println("该目录已创建");
            }
        }
    }

}
