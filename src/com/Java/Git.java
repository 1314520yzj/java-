package com.Java;
import java.util.Scanner;
public class Git{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要寻找的长度:");
        int i = input.nextInt();    //输入数字
        System.out.print("请输入字符串:");
        String str = input.next();//输入字符串

        for (int a = 1, b = 1; a <= str.length(); a++) {//对于字符串进行一个个查看

            if (str.charAt(a) == str.charAt(a + 1)) {//如果当前与后面相同
                b++;//累计次数+1
                if (b == i) {//当与所求相同
                    System.out.print(str.charAt(a));
                    break;//结束循环
                }
                    continue;//若没找到则继续下一个字符
            } else
                b = 1;//初始化

        }
    }
}
