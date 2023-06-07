static int largest(int arr[], int n, int i)
    {
        // Last index return the element
        if (i == n - 1) {
            return arr[i];
        }
 
        // Find the maximum from rest of the array
        int recMax = largest(arr, n, i + 1);
 
        // Compare with i-th element and return
        return Math.max(recMax, arr[i]);
    }