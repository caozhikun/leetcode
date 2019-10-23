package com.czk.algorithm;

/**
 * 整数反转
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author caozhikun
 * @datetime 2019/10/23
 */
public class reverse {
    private static int reverse(int x) {
        System.out.println(new StringBuilder(x).reverse().toString());
        return 0;
    }

    public static void main(String[] args) {
        reverse(123);
    }
}
