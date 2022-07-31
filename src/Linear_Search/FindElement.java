package Linear_Search;

public class FindElement {

    static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {56, 25, 155, 45, 154, 54, 2, 4, 5, 5, 4, 5, 555, 255, 5, 5};
        int element = -2;
        int result = findElement(arr, element);
        if (result != -1) {
            System.out.println("The element (" + element + ") is present on the " + result + "th Index.");
        } else System.out.println("Element not found in the array.");


    }
}
