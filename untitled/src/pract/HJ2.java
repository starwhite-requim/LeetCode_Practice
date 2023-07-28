package pract;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 计算字符出现次数
 */
public class HJ2 {
    public static void checkInfo(HashMap<Character,Integer> charMap,Character newChar){
        if (charMap.containsKey(newChar)) {
            charMap.put(newChar, charMap.get(newChar) + 1);
        } else {
            charMap.put(newChar, 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infoIn = sc.nextLine();
        Character key = sc.nextLine().charAt(0);
        char[] chars = infoIn.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char aChar : chars) {
            if (aChar == ' ' || Character.isDigit(aChar)){
                //是空格或者数字，不需要转小写
                checkInfo(charMap,aChar);
            }
            else{
                Character newChar = Character.toLowerCase(aChar);
                checkInfo(charMap,newChar);
            }

        }
        if (Character.isDigit(key) || key == ' ') {
            System.out.println(charMap.containsKey(key) ? charMap.get(key) : 0);
        }
        else{
            Character newKey = Character.toLowerCase(key);
            System.out.println(charMap.containsKey(newKey) ? charMap.get(newKey) : 0);
        }
    }
}
