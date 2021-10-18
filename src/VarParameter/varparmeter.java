package VarParameter;

public class varparmeter {
    public static void main(String[] args) {
        varparmeter v =  new varparmeter();
        int res = v.sum(1,3);
        System.out.println(res);
    }

    public int sum(int... nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
