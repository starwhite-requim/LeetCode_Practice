package pract;

import java.util.Scanner;

/**
 * 反转字符串
 */
public class HJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());
        System.out.println(stringBuilder.reverse().toString());
    }
}
