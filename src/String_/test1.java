package String_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class test1 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==b.intern()); //intern指向常量池内的地址
        String c = new String("a");// 堆->对象(引用地址）->常量池->若无就创建
        String d = "a"; //直接在常量池；

    }

}
