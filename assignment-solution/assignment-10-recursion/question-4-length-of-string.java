public class qustion-4-length-of-string {
    public static int count(String str){
		if(str.equals(""))
			return 0;
		else 
			return count(str.substring(1)) + 1; 
	}
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(count(str));
	}
}
