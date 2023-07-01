package top.uaian.algorithm.sort;

/**
 * 快速排序
 * 核心：在一个无序数组中取一个数key，每一趟排序的最终目的是：让key的左边的所有数小于key，key的右边都大于key（假设排升序）。
 * 时间复杂度 O(nlog2n) 空间复杂度  O(nlog2n)
 */
public class QuickSort implements ISort{


    @Override
    public void sort(int[] nums) {}

    @Override
    public void sort(int[] nums, int start, int end) {
        int i, j, standard;
        if(start > end)
            return;

        i = start;
        j = end;
        //标准数
        standard = nums[start];


        while (start < end){
            //先从数组后面开始找
            //必须>= 否则遇到相同的数就死循环了
            while(start < end && nums[end] >= standard){
                end--;
            }
            nums[start] = nums[end];

            while (start < end && nums[start] <= standard){
                start++;
            }

            nums[end] = nums[start];
        }
        //标准数放在中间位置
        nums[end] = standard;

        sort(nums, i, end - 1);
        sort(nums, end + 1, j);
    }
}
