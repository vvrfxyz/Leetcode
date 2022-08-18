public class maxProfit {
    int maxProfit(int[] prices){
        if (prices ==null || prices.length<2){
            return 0;
        }
        int length=prices.length;
        int[][] dp=new int[length][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i=1;i<length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[length-1][0];
    }

    /**
     * 因当天的利润只与前一天持有股票或不持有股票有关，所以用两个变量存储值，省去二维数组。
     * 最后一天手里没有股票才会利润最大化，所以返回值为不持有股票的变量。
     * @param prices
     * @return
     */
    int maxProfit_2(int[] prices) {
        if (prices==null || prices.length<2) {
            return 0;
        }
        int length=prices.length;
        int hold=-prices[0];
        int noHold=0;
        for (int i=1;i<length;i++){
            hold=Math.max(hold,noHold-prices[i]);
            noHold=Math.max(noHold,hold+prices[i]);
        }
        return noHold;
    }
    /**
     * 贪心算法
     */
    int maxProfit_3(int[] prices){
        if (prices==null||prices.length<2){
            return 0;
        }
        int total=0,index=0,length=prices.length;
        //每次找到一段趋势的最小值和最大值，然后求差值。找到所有趋势的利润求和，就是最大值。
        while (index<length){
            //找到上升趋势的最小值
            while (index<length-1 && prices[index]>=prices[index+1]) {
                index++;
            }
            int min =prices[index];
            //找到上升趋势的最大值
            while (index<length-1 && prices[index]<=prices[index+1]){
                index++;
            }
            total+=prices[index++]-min;
        }
        return total;
    }

    int maxProfit_4(int[] prices){
        int total=0;
        for (int i=1;i< prices.length;i++){
            if ((prices[i]-prices[i-1])>0) {
                total+=(prices[i]-prices[i-1]);
            }
        }
        return total;
    }


}
