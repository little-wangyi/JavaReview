package String_;

import java.text.ParseException;

public class RegisterTest {
    public static void main(String[] args) {
        RegisterTest r = new RegisterTest();
        String username = "asd";
        String password = "123256";
        String email = "123@123w.com";
        System.out.println(r.isDigital(username,password,email));
    }

    public String isDigital(String Username, String password, String email){
        if (!(Username.length() <= 4 && Username.length() >= 2)) {
            throw new RuntimeException("用户名长度错误");
        }

        if (password.length() != 6) {
            throw new RuntimeException("密码长度错误");
        }
        try {
            char[] chars = password.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                Integer.parseInt(String.valueOf(chars[i]));
            }
        } catch (Exception e) {
            throw new RuntimeException("密码不完全是数字");
        }
        if (!(email.indexOf('@') >= 0 && email.indexOf('.') >= 0 && email.indexOf('@') < email.indexOf('.'))) {
            throw new RuntimeException("邮箱顺序不对");
        }
        return "注册成功";
    }
}
