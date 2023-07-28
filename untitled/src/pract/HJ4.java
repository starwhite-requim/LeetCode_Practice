package pract;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8个数为一组，把字符串分割开，不够8位的补0
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        int spiltSize = 8;
        int startIndex = 0;
        int  endIndex = spiltSize;
        while(endIndex < s.length()){
            strings.add(s.substring(startIndex, endIndex));
            startIndex = endIndex;
            endIndex = endIndex+spiltSize;
        }


        char[] chars = s.substring(startIndex, s.length()).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (chars.length-1 >= i){
                stringBuilder.append(chars[i]);
            }
            else {
                stringBuilder.append('0');
            }
        }
        strings.add(stringBuilder.toString());

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
