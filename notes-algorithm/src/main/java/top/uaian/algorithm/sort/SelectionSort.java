package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

/**
 * 选择排序
 * 核心：每次从待排序数组中找到最大或最小的数
 * 时间复杂度 O(n2) 空间复杂度 O1
 */
public class SelectionSort implements ISort{
    @Override
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            //找到最小的数
            int min = i + 1;
            for (int j = min + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(nums[i] > nums[min]){
                ArrayUtils.swap(nums, i, min);
            }
        }
    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }
}
