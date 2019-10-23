package com.czk.algorithm;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * TODO 最简单的解法，直接转成字符串，再用reverse()方法反转
 *
 * @author caozhikun
 * @datetime 2019/10/23
 */
public class IsPalindrome {

    /**
     * 暴力解 直接使用方法
     *
     * @param x 需要判断的参数
     * @return boolean
     * @methodname isPalindrome1
     * @author caozhikun
     * @datetime 2019/10/23 15:50
     */
    private static boolean isPalindrome1(int x) {
        String a = String.valueOf(x);
        return a.equals(new StringBuilder(a).reverse().toString());
    }

    /**
     * 不使用reverse()的解法
     * TODO 抄的
     *
     * @param x 需要判断的参数
     * @return boolean
     * @methodname isPalindrome1
     * @author caozhikun
     * @datetime 2019/10/23 15:51
     */
    private static boolean isPalindrome2(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(101));
    }
}
