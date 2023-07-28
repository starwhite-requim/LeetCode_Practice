package pract;

import java.util.ArrayList;

/**
 * 最大子数组和2
 * 保存 最大子数组，寻找长度最长的
 */
public class JZ85_最大连续子数组和_内存超出限制 {
    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        int[] ints = new JZ85_最大连续子数组和_内存超出限制().FindGreatestSumOfSubArray(array);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public int sumArrayList(ArrayList<Integer> arrayList){
        return  arrayList.stream().mapToInt(Integer::intValue).sum();
    }
    public int[] FindGreatestSumOfSubArray (int[] array) {

        // array ={1,-2,3,10,-4,7,2,-5};
        //1.前N个数中的最大子数组和 为 max(前N-1项最大子数组和，前N-1项最大子数组和+第N个数）
        // dp[i] 为结尾为第N个数的子数组的最大子数组 首尾位置
        // dp[i] = sum
        int m = array.length;
        int max = array[0];
        int maxIndex = 0;
        int maxLength = 0;
        //加一层，存储 最大子数组和的长度和 值
        int[][] greatest = new int[m][2];
        greatest[0][0] = max;
        greatest[0][1] = 1;
        ArrayList<Integer>[] dp = new ArrayList[m];
        ArrayList<Integer> initDP = new ArrayList<>();
        initDP.add(array[0]);
        dp[0] = initDP;
        for (int i = 1; i < m; i++) {
            int sumPre = dp[i-1].stream().mapToInt(Integer::intValue).sum();
            int sumNow = array[i];
            ArrayList<Integer> tempArray = new ArrayList<>();
            if (sumPre+array[i] >= array[i]){
                tempArray.addAll(dp[i-1]);
                sumNow = sumPre+array[i];

            }
            tempArray.add(array[i]);

            //存入最大子数组和
            dp[i] = tempArray;
            int length = tempArray.size();
            greatest[i][0] = sumNow;
            greatest[i][1] = length;
            if (max <= sumNow){
                max = sumNow;
            }
        }
        //遍历dp和数组，寻找最长字串的下标
        for (int i = 0; i < greatest.length; i++) {
            if (max == greatest[i][0]){
                if (maxLength < greatest[i][1]){
                    maxLength = greatest[i][1];
                    maxIndex = i;
                }

            }
        }
        return dp[maxIndex].stream().mapToInt(Integer::intValue).toArray();


    }


}
