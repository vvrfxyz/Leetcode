public class myAtoi {
    public int myAtoi(String s) {
        int n=0;
        int sign=1;
        boolean haveSignFlag=false;
        for (int i=0;i<s.length();i++){
            if (!haveSignFlag){
                if (s.charAt(i)==' '){
                    continue;
                }
                if (s.charAt(i)=='+'){
                    haveSignFlag=true;
                }
                if (s.charAt(i)=='-'){
                    sign=-1;
                    haveSignFlag=true;
                }
                if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    n=n*10+(s.charAt(i)-'0');
                    haveSignFlag=true;
                }else continue;
            }else {
                if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    n=n*10+(s.charAt(i)-'0');
                }else {
                    break;
                }
            }
        }
        return n*sign;
    }
}
