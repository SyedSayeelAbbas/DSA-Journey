package ArrayAndArrayList;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[]arr={91,2,3,45,6,7};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            end--;
            start++;
        }
    }
}
