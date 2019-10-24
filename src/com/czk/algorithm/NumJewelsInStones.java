package com.czk.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 宝石与石头
 * <p>
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * @author caozhikun
 * @datetime 2019/10/24
 */
public class NumJewelsInStones {

    /**
     * 效率低下
     *
     * @param j 宝石的类型
     * @param s 拥有的石头
     * @return int
     * @methodname numJewelsInStones1
     * @author caozhikun
     * @datetime 2019/10/24 11:46
     */
    private static int numJewelsInStones1(String j, String s) {
        String[] strj = j.split("");
        String[] strs = s.split("");
        Map<String, Integer> stringMap = new HashMap<>(16);
        for (int i = 0; i < strj.length; i++) {
            stringMap.put(strj[i], i);
        }
        int count = 0;
        for (String obj : strs) {
            if (stringMap.containsKey(obj)) {
                count++;
            }
        }
        return count;
    }

    /**
     * 优解
     *
     * @param j 宝石的类型
     * @param s 拥有的石头
     * @return int
     * @methodname numJewelsInStones2
     * @author caozhikun
     * @datetime 2019/10/24 11:48
     */
    private static int numJewelsInStones2(String j, String s) {
        int res = 0;
        for (int i = 0; i < j.length(); i++) {
            for (int h = 0; h < s.length(); h++) {
                if (j.charAt(i) == s.charAt(h)) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones2("bJzh", "bbzbcdefghijklmnopqrstuvwxvzJ"));
    }
}
