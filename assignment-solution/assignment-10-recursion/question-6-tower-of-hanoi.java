public class question-6-tower-of-hanoi {
    static void towerOfHanoi(int n, int from_rod,
                             int to_rod, int aux_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                           + from_rod + " to rod "
                           + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void main(String args[])
    {
        int N = 3;
        towerOfHanoi(N, 1, 2, 3);
    }
}
