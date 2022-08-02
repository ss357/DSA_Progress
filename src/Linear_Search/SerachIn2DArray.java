package Linear_Search;

public class SerachIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {

                {6,25,89,5,-55},
                {25,78,-56,21},
                {89},
                {102,-78},

        };
        System.out.println(search2DArray(arr,100));

    }

    static boolean search2DArray(int[][] arr, int target) {
        for (int[] a:arr
             ) {
            for (int element:a
                 ) {
                if (element==target){
                    return true;
                }
            }
        }




        return false;
    }



}
