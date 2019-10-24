package com.czk.algorithm;

/**
 * 猜数字
 * <p>
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 *
 * @author caozhikun
 * @datetime 2019/10/24
 */
public class Game {

    /**
     * 虽然也可以，空间和时间都差。
     *
     * @param guess  需猜测的数组
     * @param answer 选择的数组
     * @return int
     * @methodname game1
     * @author caozhikun
     * @datetime 2019/10/24 10:12
     */
    private static int game1(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            for (int j = i; j < answer.length; j++) {
                if (guess[i] == answer[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * @param guess  需猜测的数组
     * @param answer 选择的数组
     * @return int
     * @methodname game2
     * @author caozhikun
     * @datetime 2019/10/24 10:26
     */
    private static int game2(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("结果值：" + game1(new int[]{1, 2, 1}, new int[]{2, 2, 3}));
    }
}
