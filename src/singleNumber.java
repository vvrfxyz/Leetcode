import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        int a=0;
        for (int num:nums){
            a=a^num;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(1^3);
    }
}
