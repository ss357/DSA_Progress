import java.util.Arrays;
import java.util.Scanner;

public class Two_Dimen_Array {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 15;
        System.out.println(Arrays.toString(arr1));
        ;
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println("hh");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
