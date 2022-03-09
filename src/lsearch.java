public class lsearch {
    public static int search(int arr[], int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 4, 56, 78, 90};
        int x = 100;

        int result = search(arr, x);
        if (result == -1)
            System.out.println("element not found");
        else
            System.out.println("element found: " + result);
    }

}