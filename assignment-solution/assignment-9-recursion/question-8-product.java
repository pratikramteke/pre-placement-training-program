public class question-8-product {
    public static int product(int[] arr,int n){
        if(n==1)
        return 1;
        return arr[n-1] * product(arr, n-1);
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        System.out.println(product(arr,arr.length));
    }
}
