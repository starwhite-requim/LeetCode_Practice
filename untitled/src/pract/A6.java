package pract;

import java.util.*;

/**
 * 字符串分割（二）
 * 除第一个字串外，其余所有字串进行分割，分割后进行大小写转换
 */
public class A6 {
    public static String stringConvert(String strNow){
        //字符串段大小写转换
        int lowerNumber = 0;
        int upNumber = 0;
        for (char c : strNow.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                //小写字母
                lowerNumber++;
            } else if (c >= 'A' && c <= 'Z') {
                upNumber++;
            }
        }
        if (lowerNumber > upNumber) {
            //小写字母多
            return strNow.toLowerCase(Locale.ROOT);
        } else if (lowerNumber < upNumber) {
            //大写字母多
            return strNow.toUpperCase(Locale.ROOT);
        }
        else return strNow;
    }
    public static void changeList(String s){
        //1. 分割原字符串，以 - 进行分割
        //2. 结果存入List
        //3. 以K进行 分割
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.nextLine());
        StringBuilder stringBuilder = new StringBuilder();
        StringJoiner stringJoiner = new StringJoiner("-");
        int StartIndex = 0;
        int EndIndex = key;
        String[] split = s.split("-");

        stringJoiner.add(split[0]); // 第一个字符串直接放入
        for (int i = 1; i < split.length; i++) {
            stringBuilder.append(split[i]); // 剩余所有字符串进行组合
        }
        while(EndIndex < stringBuilder.length()){
            //剩余字符串按key进行分割
            String substring = stringBuilder.substring(StartIndex, EndIndex);
            StartIndex = EndIndex;
            EndIndex = EndIndex+key;
            stringJoiner.add(stringConvert(substring));

        }
        stringJoiner.add(stringConvert(stringBuilder.substring(StartIndex,stringBuilder.length())));
        System.out.println(stringJoiner.toString());
    }
    public static void main(String[] args) {
        A6.changeList("12abc-abCABc-4aB@");
    }
}
