package com.czk.algorithm;

/**
 * 机器人能否返回原点
 * <p>
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完
 * 成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 * @author caozhikun
 * @datetime 2019/10/25
 */
public class JudgeCircle {

    /**
     * @param moves 有效动作
     * @return boolean
     * @methodname c
     * @author caozhikun
     * @datetime 2019/10/29 09:48
     */
    private static boolean judgeCircle1(String moves) {
        if (moves.length() % 2 != 0) {
            return false;
        }
        int lconut = 0;
        int rconut = 0;
        int uconut = 0;
        int dconut = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                lconut++;
            } else if (moves.charAt(i) == 'R') {
                rconut++;
            } else if (moves.charAt(i) == 'U') {
                uconut++;
            } else if (moves.charAt(i) == 'D') {
                dconut++;
            }
        }
        return lconut == rconut && uconut == dconut;
    }

    /**
     * 解法一的优化
     *
     * @param moves 有效动作
     * @return boolean
     * @methodname judgeCircle2
     * @author caozhikun
     * @datetime 2019/10/29 09:49
     */
    private static boolean judgeCircle2(String moves) {
        int x = 0;
        int y = 0;
        for (char m : moves.toCharArray()) {
            if (m == 'L') {
                x++;
            } else if (m == 'R') {
                x--;
            } else if (m == 'U') {
                y++;
            } else if (m == 'D') {
                y--;
            }
        }
        return x == y;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle2("UUDRDLLRUUDD"));
    }
}
