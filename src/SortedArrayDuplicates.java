import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 */
public class SortedArrayDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 3, 3, 4, 5, 6}));
    }

    /**
     * 暴力算法
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < len; j++){
            if(nums[i] != nums[j] && ++i != j){
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}
