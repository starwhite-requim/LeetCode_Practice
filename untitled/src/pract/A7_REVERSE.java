package pract;

import java.util.Scanner;
import java.util.Stack;

/**
 * A7字符串解压缩算法的逆向过程，即字符串压缩过程
 */
public class A7_REVERSE {
    public  static void zip(Stack<Character> stringStack,int num,StringBuilder stringBuilder){
        //压缩栈内元素
        Character peek = stringStack.peek();
        while (!stringStack.isEmpty()){
            stringStack.pop();
            num++;
        }
        if (num <= 2){
            for (int i = 0; i < num; i++) {
                stringBuilder.append(peek);
            }
        }
        else {
            stringBuilder.append(num);
            stringBuilder.append(peek);
        }

        System.out.print(num);
        System.out.print(peek);
        System.out.println();
        num = 0;
    }
    public static String zipString(String stringIn){
        Stack<Character> stringStack = new Stack<>();
        int num = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stringIn.toCharArray()) {
            if (stringStack.isEmpty() || stringStack.peek() == c){
                stringStack.push(c);
            }
            else{
                zip(stringStack,num,stringBuilder);
                stringStack.push(c);
            }
        }
        if (!stringStack.isEmpty()){
            zip(stringStack,num,stringBuilder);
        }

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(zipString(scanner.nextLine()));

    }
}
