package pract;

import java.util.Arrays;
import java.util.Scanner;

/**
 * IPV4转为整数
 * 需要判断输入的IPV4格式，以#进行分割
 */
public class A2 {
    public static String getBinary(int code){
        //获取8位原码
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 7; i >=0 ; i--) {
            stringBuilder.append((code & 1<<i) == 0 ? "0":"1");
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();

    }
    public static String check(){
        Scanner sc = new Scanner(System.in);
        String ipIn = sc.nextLine();
        try{
            int[] ips = Arrays.stream(ipIn.split("#")).mapToInt(Integer::parseInt).toArray();
            for (int ip : ips) {
                System.out.println(ip);
            }
            if (ips.length < 4){
                return "Invalid IP";
            }
            int ip1 = ips[0];
            int ip2 = ips[1];
            int ip3 = ips[2];
            int ip4 = ips[3];
            if (ip1 == 255 && ip2 == 255 && ip3 == 255 & ip4 == 255){
                return "Invalid IP";
            }
            else if (ip1>=0 && ip1<=255 & ip2 >=0 &ip2 <= 255 & ip3 >=0 && ip3<=255 &ip4 >=0 &ip4<=255){
//                String ori = getBinary(ip1) + getBinary(ip2) + getBinary(ip3) + getBinary(ip4);
                String ori = getBinary(ip1) + getBinary(ip2) + getBinary(ip3) + getBinary(ip4);
                return String.valueOf(Long.parseLong(ori,2));
            }
            else {
                return "Invalid IP";
            }
        }
        catch (NumberFormatException e){
            return "invalid IP";
        }
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}
