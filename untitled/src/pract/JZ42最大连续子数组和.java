package pract;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 输入一个长度为n的整型数组array，数组中的一个或连续多个整数组成一个子数组，子数组最小长度为1。求所有子数组的和的最大值。
 * 数据范围:
 */
public class JZ42最大连续子数组和
{

    public static void main(String[] args) {
        //1.前N个数中的最大子数组和 为 max(前N-1项最大子数组和，前N-1项最大子数组和+第N个数）
        int[] array ={1,-2,3,10,-4,7,2,-5};
        int dp = array[0];
        int max = dp;
        for (int i = 1; i < array.length; i++) {
           dp = Math.max(dp+array[i],array[i]);
           max = max > dp ? max:dp;
        }
        System.out.println(max);
    }
}
