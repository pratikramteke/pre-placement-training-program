public class question-1-power-of-2 {
    public static boolean isPowerOfTwo(int n) {
        if (((n<=0)) || (Integer.lowestOneBit(n) != n)) {
            return false;
            }
           else {
            return true;
           }
       }

    public static void main(String[] args)
    {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
}
