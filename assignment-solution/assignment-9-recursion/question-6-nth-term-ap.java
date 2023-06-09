public class Solution {
    public static void main(String[] args) {
        int a = 2;
        int d = 1;
        int n = 5;
 
        int nthTerm = a;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        System.out.println(nthTerm);
    }
}