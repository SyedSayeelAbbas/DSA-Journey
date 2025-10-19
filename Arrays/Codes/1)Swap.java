public class Swap {
    public static void main(String[] args) {
        int[]arr={1,2,3,45,6,7};
        swap(arr,2,3);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }

}
