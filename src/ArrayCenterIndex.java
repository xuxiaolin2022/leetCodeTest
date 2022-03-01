import java.util.Arrays;

/**
 *
 */
public class ArrayCenterIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,1,1,0,1}));
    }

    public static int pivotIndex(int[] nums){
        int sum = Arrays.stream(nums).sum();
        int leftTotal = 0;
        for(int i = 0; i<nums.length;i++){
            leftTotal += nums[i];
            if(leftTotal == sum){
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }
}
