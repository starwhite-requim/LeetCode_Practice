package pract;

import java.util.Scanner;

/**
 * 3个汽水瓶可以换1瓶水，给定N个汽水瓶，计算总共能喝多少瓶水
 */
public class 汽水瓶 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            countB(sc.nextInt());
        }

    }
    public static void countB(int i){
        int sum = 0;
        int rest = 0;
        while (i >= 3){
            rest = i%3;
            int get = i/3;
            sum += get;
            i = rest + get;
        }
        if (i == 2){
            sum++;
        }
        if (sum>0){
            System.out.println(sum);
        }

    }
}
