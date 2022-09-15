public class firstUniqChar {
    public int firstUniqChar(String s) {
        char[] a=s.toCharArray();
        int n=-1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                n=i;
                if (i==j)continue;
                if (a[i]==a[j]) {
                    n=-1;
                    break;
                }
                if (j==(a.length-1) &&n!=-1)return n;
            }

        }
        return n;
    }
}
