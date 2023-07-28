package pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 明明生成了
 * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * 数据范围：1≤n≤1000  ，输入的数字大小满足1≤val≤500
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[1000];
        int headNum = sc.nextInt();
        while (sc.hasNextInt()){
            int val = sc.nextInt();
            array[val] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                System.out.println(array[i]);
            }
        }
//        while (sc.hasNextLine()){
//            String s = sc.nextLine();
//            if(s.equals("")) break;
//
//            else {
//                arrayList.add(Integer.valueOf(s));
//            }
//            //所有内容全放入一个链表当中
//        }
//        //从小到大排序数组列表
//        arrayList.remove(0);
//        Collections.sort(arrayList);
//        for (int i = 0; i < arrayList.size()-1; i++) {
//            if (arrayList.get(i) == arrayList.get(i+1)){
//                //当前值与后一个数字相等
//                //
//                arrayList.remove(i);
//                i--;//索引回退
//            }
//        }
//
//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }

    }
}
