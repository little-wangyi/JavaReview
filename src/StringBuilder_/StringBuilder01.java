package StringBuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {
        //单线程安全，多线程建议用StringBuffer
        //效率:StringBuilder > StringBuffer > String
        StringBuilder stringBuilder = new StringBuilder();
        //用法同StringBuffer
    }
}
