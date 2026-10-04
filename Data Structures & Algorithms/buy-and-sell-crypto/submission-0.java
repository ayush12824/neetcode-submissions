class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                int profit=prices[i]-buy;
                ans=Math.max(profit,ans);
            }else{
                buy=prices[i];
            }
        }

        return ans;
    }
}
