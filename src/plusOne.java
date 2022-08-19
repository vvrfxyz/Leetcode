import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits){
        int inc=0;
        Boolean flag=false;
        if (digits[digits.length-1]==9) {
            if (digits.length==1)flag=true;
            digits[digits.length-1]=0;
            inc=1;
        }else {
            digits[digits.length-1]++;
        }

        for (int i= digits.length-2;i>=0;i--){
            if (inc==1){
                if (digits[i]==9){
                    if (i==0)flag=true;
                    digits[i]=0;
                    inc=1;
                }else {
                    digits[i]++;
                    inc=0;
                }
            }
        }
        if (flag){
            int[] result=new int[digits.length+1];
            result[0]=1;
            for (int i=0;i< digits.length;i++){
                result[i+1]= digits[i];
            }
            return result;
        }else {
            return digits;
        }
    }

    public static int[] plusOne_New(int[] digits){
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            }else {
                digits[i]=0;
            }
        }
        int temp[]=new int[digits.length+1];
        temp[0]=1;
        return  temp;
    }

    public static void main(String[] args) {
        int[] digits=new int[]{0};
        plusOne(digits);
    }
}
