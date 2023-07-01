package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

/**
 * 冒泡排序
 * 核心：依次比较两个相邻的元素，如果他们的顺序错误就把他们交换过来
 * 时间复杂度 On2 空间复杂度 O1
 */
public class BubbleSort implements ISort{
    @Override
    public void sort(int[] nums) {
        int len = nums.length;
        //第一遍循环:待冒泡的数，一直到倒数第二个数
        for (int i = 0; i < len - 1; i++) {
            //第二遍循环：冒泡的数和后面所有的数依次冒泡，如果大于后面的数，则交换位置
            for (int j = 0; j < len - 1 - i; j++) {
                if(nums[j] > nums[j+1]){
                    ArrayUtils.swap(nums, j, j+1);
                }
            }
        }
    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }
}
