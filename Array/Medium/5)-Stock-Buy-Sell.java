class Solution {
    public int maxProfit(int[] prices) 
    {
        int i = 0;
        int min = prices[0];
        int max = 0;

        for(i = 1; i < prices.length; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                if(max < prices[i] - min)
                {
                    max = prices[i] - min;
                }
            }
        }
        return max;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?utm=codolio
