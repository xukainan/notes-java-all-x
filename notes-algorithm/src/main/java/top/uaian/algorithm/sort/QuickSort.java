package top.uaian.algorithm.sort;

public class QuickSort implements ISort{


    @Override
    public void sort(int[] nums) {}

    @Override
    public void sort(int[] nums, int start, int end) {
        int i, j, standard;
        if(start >= end)
            return;

        i = start;
        j = end;
        standard = nums[start];


        while (start < end){
            while(start < end && nums[end] >= standard){
                end--;
            }
            nums[start] = nums[end];

            while (start < end && nums[start] <= standard){
                start++;
            }

            nums[end] = nums[start];
        }

        nums[end] = standard;

        sort(nums, i, end - 1);
        sort(nums, end + 1, j);
    }
}
