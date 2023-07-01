package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

/**
 * 插入排序
 * 核心：往已经排序好的数组中插入一个新的数
 * 时间复杂度 O(n2) 空间复杂度 O1
 */
public class InsertSort implements ISort{
    @Override
    public void sort(int[] nums) {
        //待排序的数Index
        for (int i = 0; i < nums.length; i++) {
            int cur = i;
            //已经排序好的数组
            for (int j = i - 1; j >= 0 ; j--) {
                if(nums[cur] < nums[j]){
                    ArrayUtils.swap(nums, cur, j);
                    cur--;
                }else {
                    break;
                }
            }
        }
    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }
}
