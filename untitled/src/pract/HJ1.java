package pract;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String infoIn = in.nextLine();
        String[] s = infoIn.split(" ");
        String s1 = s[s.length-1];
        System.out.println(s1.toCharArray().length);

    }
}
