import java.util.Arrays;

/**
 * x的平方根
 */
public class SqrtX {
    public static void main(String[] args) {

        System.out.println(binarySearch(1));
        System.out.println(binarySearch(2));
        System.out.println(binarySearch(3));
        System.out.println(binarySearch(4));
        System.out.println(binarySearch(25));
        System.out.println(binarySearch(26));
    }

    /**
     * 二分查找
     * @param x
     * @return
     */
    public static int binarySearch(int x){
        int index = -1, l = 0, r = x / 2;
        while (l <= r){
            int mid = (l + r) /2;
            if(mid * mid <= x){
                index = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return index;
    }

    public static int newton(int x){
        if(x <= 0){
            return -1;
        }
        return (int)sprt(x,x);
    }

    public static double sprt(double i ,int x){
        double mid = (i + x / i) / 2;
        if(mid == i){
            return i;
        }
        return sprt(mid, x);
    }




}
