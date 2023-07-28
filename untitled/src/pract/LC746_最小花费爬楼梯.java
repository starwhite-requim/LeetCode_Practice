package pract;

public class LC746_最小花费爬楼梯 {
    public static void main(String[] args) {
        int[] cost =  {1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[cost.length+1]; //顶楼为cost数组后一个下标
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        System.out.println(dp[dp.length-1]);
    }
}
