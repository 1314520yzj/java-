package com.Java;
import java.util.Scanner;
public class Git{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要寻找的长度:");
        int i = input.nextInt();
        System.out.print("请输入字符串:");
        String str = input.next();

        for (int a = 1, b = 1; a <= str.length(); a++) {

            if (str.charAt(a) == str.charAt(a + 1)) {
                b++;
                if (b == i) {
                    System.out.print(str.charAt(a));
                    break;
                }
                    continue;
            } else
                b = 1;

        }
    }
}
