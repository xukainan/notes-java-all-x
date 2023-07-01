package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

/**
 * 堆排序
 * 核心：构造最大堆，将堆顶元素依次排序
 * 时间复杂度 O(nlog2n) 空间复杂度 O1
 */
public class HeapSort implements ISort{
    @Override
    public void sort(int[] nums) {
        int len = nums.length;
        //先构建最大堆
        //length/2 - 1 找到最后一个有子节点的父节点
        for (int i = len/2 -1; i >= 0; i--) {
            transMaxHeap(nums, i, len);
        }
        //每次将数组的最大值（下标为0）与数组MaxIndex的值交换位置后，重新构造最大堆
        for (int j = len -1; j >= 1; j--) {
            ArrayUtils.swap(nums, 0, j);
            //因为每次数组的MaxIndex已经排序好，所以在构造最大堆时，j当成数组长度传入
            transMaxHeap(nums, 0, j);
        }

    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }


    private void transMaxHeap(int[] nums, int i, int len) {
        int maxIndex = i;
        //左右子节点Index
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //寻找最大值
        if(left < len && nums[left] > nums[maxIndex])
            maxIndex = left;
        if(right < len && nums[right] > nums[maxIndex])
            maxIndex = right;

        if(maxIndex != i){
            ArrayUtils.swap(nums, maxIndex, i);
            //在堆的中间层级，递归判断以当前交换后的堆的元素为堆顶的堆是否满足最大堆
            transMaxHeap(nums, maxIndex, len);
        }
    }

}
