package OverAllJavaProgram;

class MainI {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        evenNumbers(start, end);
    }

    public static void evenNumbers(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.println(start);
        }
        evenNumbers(start + 1, end);
    }
}
