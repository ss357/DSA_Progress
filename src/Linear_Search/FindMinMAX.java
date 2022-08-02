package Linear_Search;

public class FindMinMAX {
    public static void main(String[] args) {
        int[] arr = {25, 254, -56, 45, 25, 0};
        System.out.println("Min element is: "+minFinder(arr));
        System.out.println("Max element is : "+maxFinder(arr));
    }

    static int minFinder(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int element : arr
        ) {
            if (element < min) {
                min = element;
            }

        }

        return min;
    }

    static int maxFinder(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int element : arr
        ) {
            if (element > max) {
                max = element;
            }

        }

        return max;
    }
}
