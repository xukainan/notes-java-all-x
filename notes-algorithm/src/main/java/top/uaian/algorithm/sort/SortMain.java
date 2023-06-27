package top.uaian.algorithm.sort;

import top.uaian.notes.ArrayUtils;

public class SortMain {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 23, 17, 5, 27, 31, 100, 17, 1};
//        ISort quickSort = new QuickSort();
//        quickSort.sort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        ArrayUtils.swap(nums, 1, 3);
        System.out.println(11);
    }
}
