package pract;

import java.util.*;
import java.util.stream.Collectors;


public class A1 {
    /**
     * 给定字符串和需要修改的字段索引，把对应的字段全部以 *** 替换
     * @param Index    字段索引
     * @param charLen    给定字符串
     * @return
     */
    public String solve (int Index,String charLen) {
        // write code here
        Scanner sc = new Scanner(System.in);
        int ind = Integer.parseInt(sc.nextLine());
        Character[] a;
        String content = sc.nextLine();
        LinkedList<String> result = new LinkedList<>();
        StringBuilder charIn = new StringBuilder();
        char[] contentArray = content.toCharArray();
        for (char c : contentArray) {
            if (c == '_' &&!charIn.isEmpty()&&charIn.charAt(0) == '\"'){
                charIn.append(c);
            }
            else if (c == '_')
            {
                String s = charIn.toString();
                result.add(s);
                charIn = new StringBuilder();
            }
            else if (c == '\"' && charIn.isEmpty()){
                charIn.append(c);
            }
            else if (c == '\"' && !charIn.isEmpty()){
                charIn.append(c);
                result.add(charIn.toString());
                charIn = new StringBuilder();
            }
            else {
                charIn.append(c);
            }
        }
        if(!charIn.isEmpty()){

            result.add(charIn.toString());
            charIn = null;
        }
        result.removeIf(String::isEmpty);
        for (String s : result) {
            System.out.println(s);
        }
        result.set(ind,"******");
        System.out.println(result.stream().collect(Collectors.joining("_")));
        StringJoiner stringJoiner = new StringJoiner("_");
        for (String s : result) {
            stringJoiner.add(s);
        }
        System.out.println(stringJoiner.toString());
        return null;
    }

    public static void main(String[] args) {
        new A1().solve(1,"NIHAO");

    }
}
