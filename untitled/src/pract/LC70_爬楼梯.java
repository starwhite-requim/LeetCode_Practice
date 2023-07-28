package pract;

/**
 * 动态规划入门题
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class LC70_爬楼梯 {
    //1. 确定dp数组含义 dp[n] 爬到第N个台阶的方法个数
    //2. 递归公式， dp [n] = dp[n-1] + dp[n-2];
    //3. 初始化 dp[0] = 1 dp[1] = 2
    //循环遍历
    // dp 数组只需要维护 dp[n-1] 和 dp[n-2] 两个值，优化
    public static void Climb(int n){
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 2;
        int sumN = 0;
        if (n == 1){
            System.out.println(1);
        }
        else if(n == 2){
            System.out.println(2);
        }
        else {
            //
            for (int i = 2; i < n; i++) {
                sumN = dp[0] + dp[1];
                dp[0] = dp[1];
                dp[1] = sumN;
            }
        }
        System.out.println(sumN);
    }
    public static void main(String[] args) {
        Climb(5);
    }
}
