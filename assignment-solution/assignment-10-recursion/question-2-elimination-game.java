public class question-2-elimination-game {
    public static int lastRemaining(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            int temp = lastRemaining(n / 2);
            result = 2 * (1 + n / 2 - temp);
        }
        return result; 
    }
	public static void main(String[] args) {
		int n=9;
		System.out.println(lastRemaining(n));
	}
}
