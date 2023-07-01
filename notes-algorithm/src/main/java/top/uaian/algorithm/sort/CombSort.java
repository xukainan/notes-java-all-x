package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

/**
 * 梳排序
 * 核心：冒泡排序的改进算法。它主要的思想是通过比较元素和固定步长位置上的数据，先进行部分优化，然后逐步减少步长，以此来对数据进行预处理。
 * 实验显示步长因子设置为1.3时能获得较好的性能
 * 时间复杂度 O(nlogn) 空间复杂度 O1
 */
public class CombSort implements ISort{
    @Override
    public void sort(int[] nums) {
        int len = nums.length;
        int step = len;
        //步长每次除以1.3直至等于1
        //等于1的时候相当于冒泡排序
        while ((step = (int) (step / 1.3)) >= 1){
            for (int i = step; i < len; i++) {
                if(nums[i] < nums[i - step]){
                    ArrayUtils.swap(nums, i, i-step);
                }
            }
        }
    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }
}
