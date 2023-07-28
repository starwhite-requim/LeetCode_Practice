package pract;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 最大子数组和优化
 */
public class JZ85_最大连续子数组和 {
    public static void main(String[] args) {

    }
    public int[] FindGreatestSumOfSubArray (int[] array) {

        // array ={1,-2,3,10,-4,7,2,-5};
        //1.前N个数中的最大子数组和 为 max(前N-1项最大子数组和，前N-1项最大子数组和+第N个数）
        // dp[i] 为结尾为第N个数的子数组的最大子数组首尾位置以及他们的和
        // dp[i] = sum
        // 要知道最长的一串，需要保存字串，但保存全部字串会超出内存限制，仅保存 头部和尾部下标
        //1. 创建dp数组
        int m = array.length;
        int[][] dp = new int[m][3];
        //2.递推公式
        // dp[i] = dp[i-1].sum + arr[i] >= arr[i] ? dp[i] = [dp[i-1][0],i] : dp[i] = [i,i]
        //3.初始化dp数组
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = array[0];
        int sumPre = array[0];
        int max = array[0];
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 1; i < m; i++) {
            if (dp[i-1][2]+array[i] >= array[i]){
                dp[i][0] = dp[i-1][0];
                dp[i][1] = i;
                //当前子数组和大小
                dp[i][2] = dp[i-1][2]+array[i];

            }
            else {
                dp[i][0] = i;
                dp[i][1] = i;
                dp[i][2] = array[i];
            }
            if (max < dp[i][2]){
                max = dp[i][2];
            }
        }
        for (int i = 0; i < m; i++) {
            if (dp[i][2] == max){
                //记录maxLength和maxIndex
                if (maxLength < dp[i][1]+1-dp[i][0]){
                    maxLength = dp[i][1]+1-dp[i][0];
                    maxIndex = i;
                }
            }
        }
        return Arrays.copyOfRange(array,dp[maxIndex][0],dp[maxIndex][1]+1);
    }
}
