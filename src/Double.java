public class Double {
    public static void main(String[] args) {
        System.out.println(isDivisible(48,16,12));//true
        System.out.println(isDivisible(48,30,4));//false
    }
    public static boolean isDivisible(long n, long x, long y) {
        if ((n % x == 0)&& (n % y == 0)){
            return true;
        }
        return false;
    }
}
