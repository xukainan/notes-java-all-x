package top.uaian.algorithm.sort;

/**
 * 希尔排序
 * 核心：是把数组按下标的一定增量分组，对每组使用直接插入排序算法排序；当增量减至1时，即直接插入排序
 *
 * 时间复杂度 O(n^1.3) 空间复杂度 O1
 */
public class ShellSort implements ISort{
    @Override
    public void sort(int[] nums) {
        int len = nums.length;
        //增量每次除以2
        for (int step = len / 2; step >= 1; step/=2) {
            //从增量那组开始往回插入排序
            for (int i = step; i < len; i++) {
                int standard = nums[i];
                int j = i;
                //j-step 同一组前面的数
                while (j-step >= 0 && nums[j-step] > standard){
                    //如果大于，则往前移动
                    nums[j] = nums[j-step];
                    j-=step;
                }
                //前面没有大的数了，就放在这个位置
                nums[j] = standard;
            }

        }
    }

    @Override
    public void sort(int[] nums, int start, int end) {

    }
}
