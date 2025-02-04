package OverAllJavaProgram;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = arraySum(arr, arr.length);
        System.out.println("Sum of elements in array: " + result);
    }

    public static int arraySum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + arraySum(arr, n - 1);
    }
}
