package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,4,5,6,7,9494,39495,80000},80000));
    }

    public static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int m = l + (r-l)/2;
            if(arr[m] == x) {
                return m;
            }
            if(x > arr[m]) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return -1;
    }
}
