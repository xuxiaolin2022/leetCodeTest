import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和-
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0,1,2,3,4,5,6,8,12},20)));
        System.out.println(Arrays.toString(solution1(new int[]{0,1,2,3,4,5,6,8,12},20)));
        System.out.println(Arrays.toString(solution2(new int[]{0,1,2,3,7},5)));
        System.out.println(Arrays.toString(solution3(new int[]{0,1,2,3,7},5)));
    }

    /**
     * 无序数组
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution(int[] nums,int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
         return new int[]{0};
    }

    /**
     * 升序数组
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution1(int[] nums,int target){
        out:for (int i = 0; i < nums.length; i++){
            int i1 = target - nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if(nums[j] == i1){
                    return new int[]{i,j};
                }else if(nums[j] > i1){
                    continue out;
                }
            }
        }
        return new int[]{0};
    }

    /**
     * 升序数组
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution3(int[] nums,int target){
        int left, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            int i1 = target - nums[i];
            left = i + 1;
            int j = getRightValue(nums,i1,left,right);
            if(j > 0){
                return new int[]{i,j};
            }
        }
        return new int[]{0};
    }

    private static int getRightValue(int[] nums, int value, int left, int right) {
        if(left >= right){
            if (nums[right] == value) {
                return left;
            }else {
                return 0;
            }
        }
        int mid = (left + right) / 2;
        if (nums[mid] == value) {
            return mid;
        }else if(nums[mid] > value){
            return getRightValue(nums,value,left,mid - 1);
        }else {
            return getRightValue(nums,value,mid + 1,right);
        }
    }

    /**
     * 无序数组
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution2(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            int mid = target - nums[i];
            Integer j = map.get(mid);
            if(j != null){
                return new int[]{j,i};
            }else {
                map.put(nums[i],i);
            }

        }
        return new int[]{0};
    }
}
