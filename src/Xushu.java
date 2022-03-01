

/**
 * 统计素数个数-
 *
 */
public class Xushu {

    public static int max = (int)Math.sqrt(Integer.MAX_VALUE);

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        //System.out.println(bf(Integer.MAX_VALUE));
        long m = System.currentTimeMillis();
        System.out.println(eratosthenes(Integer.MAX_VALUE));
        long e = System.currentTimeMillis();
        System.out.println(m - s);
        System.out.println(e - m);
    }

    /**
     * 暴力算法
     * @param n
     * @return
     */
    private static int bf(int n) {
        int count = 0;
        for(int i = 2;i < n;i++){
            if(ifPrime(i)){
                count++;
            };
        }
        return count;
    }

    private static boolean ifPrime( int x) {
        for (int i = 2; i * i  <= x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * 埃氏筛选
     * @param n
     * @return
     */
    public static int eratosthenes(int n){
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for(int i = 2;i < n; i++){
            if (!isPrime[i]) {
                count++;
                if(i <= max){
                    for(int j = i * i; j < n;j+= i){
                        isPrime[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
