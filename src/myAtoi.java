public class myAtoi {
    public static int myAtoi(String s) {
        int n=0;
        int sign=1;
        boolean haveSignFlag=false;
        boolean yichu=false;
        boolean firstchar=false;
        for (int i=0;i<s.length();i++){
            if (!haveSignFlag){
                if (s.charAt(i)==' '){
                    continue;
                }
                if (s.charAt(i)=='+'){
                    haveSignFlag=true;
                    firstchar=true;
                }
                if (s.charAt(i)=='-'){
                    sign=-1;
                    haveSignFlag=true;
                    firstchar=true;
                }
                if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    break;
                }
                if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                    break;
                }
                if (!(s.charAt(i)>='0'&&s.charAt(i)<='9')&&!firstchar)break;
                if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    n=n*10+(s.charAt(i)-'0');
                    haveSignFlag=true;
                    firstchar=true;
                }continue;
            }else {
                if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    if (n>n*10+(s.charAt(i)-'0')){
                        yichu=true;
                        break;
                    }else {
                        n=n*10+(s.charAt(i)-'0');
                    }
                }else {
                    break;
                }
            }
        }
        if (yichu){
            if (sign>0)return (int)Math.pow(2,31)-1;
            else return (int)Math.pow(2,31)*(-1)-1;
        }
        return n*sign;
    }

    public static void main(String[] args) {
        int a=myAtoi(" -91283472332");
        System.out.println(a);
    }
}
