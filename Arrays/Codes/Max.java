package ArrayAndArrayList;

public class Max {
    public static void main(String[] args) {
        int[]arr={91,2,3,45,6,7};
        System.out.println(max(arr,0,2));
    }
    static int max(int[] a,int start,int end){
        if(end>start){
            return -1;
        }

        if(a==null){
            return -1;
        }
        int max=a[start];
        for (int i=start;i<=end;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
