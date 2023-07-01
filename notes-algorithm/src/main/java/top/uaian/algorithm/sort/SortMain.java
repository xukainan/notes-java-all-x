package top.uaian.algorithm.sort;

public class SortMain {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 23, 17, 5, 27, 31, 100, 17, 1};
        ISort isort = new ShellSort();
        isort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
