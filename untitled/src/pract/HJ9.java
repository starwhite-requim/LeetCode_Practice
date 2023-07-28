package pract;

import java.util.*;

/**
 * 从右往左读整数，去重
 */
public class HJ9 {
    public static void main(String[] args) {
        int[] arrayIn = new int[10];
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        String s = stringBuilder.reverse().toString();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            Integer convertC = Integer.parseInt(String.valueOf(c));
            if (!resultList.contains(convertC)){
                resultList.add(Integer.valueOf(convertC));
            }
        }
        for (Integer integer : resultList) {
            System.out.print(integer);
        }
        System.out.println();
    }
}
