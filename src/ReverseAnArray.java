import java.util.Arrays;

public class ReverseAnArray {
    static void Swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;

    }
    static void reverseArray(int[] arr){
        for(int i=0,j= arr.length-1;i<j;i++,j--){

            Swap(arr,i,j);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,54,15};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
