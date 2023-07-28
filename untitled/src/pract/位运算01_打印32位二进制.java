package pract;

public class 位运算01_打印32位二进制 {
    public static void print(int num){
        for (int i = 31; i >=0 ; i--) {
            System.out.print(((num&1<<i) == 0 ? "0":"1"));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        位运算01_打印32位二进制.print(-1);
        int num = -3;
        System.out.println(~num);
        int num_1 = -1-~num;
        System.out.println(num_1);
        位运算01_打印32位二进制.print(num);
        位运算01_打印32位二进制.print(num_1);
    }
}
