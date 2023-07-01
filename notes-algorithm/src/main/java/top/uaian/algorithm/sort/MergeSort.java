package top.uaian.algorithm.sort;

/**
 * 归并排序
 * 核心：分而治之。拿两个已经有序的序列重新组合成一个有序的序列
 * 时间复杂度 O(nlog2n) 空间复杂度 On
 */
public class MergeSort implements ISort{
    @Override
    public void sort(int[] nums) {
    }

    @Override
    public void sort(int[] nums, int start, int end) {
        //递归到只有一个数的时候return
        if(start >= end)
            return;

        //递归拆分数组
        int len = nums.length;
        int mid = (start + end) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);

        //合并
        merge(nums, start, mid, end, len);
    }

    private void merge(int[] nums, int start, int mid, int end, int len) {
        int[] tmp = new int[len];
        int tmpIndex = start;
        int secondIndex = mid + 1;
        int finalIndex = start;
        //比较两个数组值
        while (start <= mid && secondIndex <= end){
            if(nums[start] < nums[secondIndex]){
                tmp[tmpIndex++] = nums[start++];
            }else {
                tmp[tmpIndex++] = nums[secondIndex++];
            }
        }

        while (start <= mid){
            tmp[tmpIndex++] = nums[start++];
        }

        while (secondIndex <= end){
            tmp[tmpIndex++] = nums[secondIndex++];
        }

        //放回原数组
        while (finalIndex <= end){
            nums[finalIndex] = tmp[finalIndex++];
        }

    }
}
