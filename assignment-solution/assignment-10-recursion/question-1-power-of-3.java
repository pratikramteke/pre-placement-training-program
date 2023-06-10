public class question-1-power-of-3 {
    public static boolean is_power_of_3(int n){
		if(n<=0)
			return false;
		if(n%3==0)
			return is_power_of_3(n/3);
		if(n==1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int n=27;
		System.out.println(is_power_of_3(n));
	}
}
