package com.czk.algorithm;

/**
 * 整数反转
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2的31次方,  2的31次方 − 1]。请根据这个假设，如果反转后整数溢出那么就返回0。
 * TODO 溢出判断不理解。
 * TODO 由于x类型是int,所以会导致精度问题，除于10相当于抹掉最后一位，不会出现小数位
 *
 * @author caozhikun
 * @datetime 2019/10/23
 */
public class Reverse {
    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            System.out.println(pop);
            x /= 10;
            System.out.println(x);
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
            System.out.println(rev);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1243784));
    }
}
