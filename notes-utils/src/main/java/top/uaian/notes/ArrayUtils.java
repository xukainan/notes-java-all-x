package top.uaian.notes;

public class ArrayUtils {

    public static void swap(int[] nums, int i, int j){
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
