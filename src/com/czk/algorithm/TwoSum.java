package com.czk.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * @author caozhikun
 * @datetime 2019/10/23
 */
public class TwoSum {

    /**
     * 解法一：
     * 两次遍历，用目标值减去第一次遍历的值，如果等于第二次遍历的值，返回第一次遍历值和第二次遍历值的下标
     *
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     * @methodname solution1
     * @author caozhikun
     * @datetime 2019/10/23 11:08
     */
    private static int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            for (int j = i; j < nums.length; j++) {
                System.out.println("j=====" + nums[j]);
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 解法二：
     * 一次遍历，先new HashMap,如果目标值减去遍历的值，不存在HashMap中，值把遍历的值和下标存入HashMap，直到遍历结束。
     *
     * @param nums   数组
     * @param target 目标值
     * @return int[]
     * @methodname solution2
     * @author caozhikun
     * @datetime 2019/10/23 11:35
     */
    private static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            int c = target - nums[i];
            if (integerMap.containsKey(c)) {
                return new int[]{i, integerMap.get(c)};
            }
            integerMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] num = {3, 10, 6, 5, 4, 7};
        System.out.println(Arrays.toString(solution2(num, 7)));
    }
}
