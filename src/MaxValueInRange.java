public class MaxValueInRange {
    static int inRangeMaxValue(int arr[], int startIndex, int endIndex) {
        int maxVal=Integer.MIN_VALUE;
        for(int i =startIndex;i<=endIndex;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 41, 58, 0, 12, 78};

int res =inRangeMaxValue(arr,1,5);
        System.out.println(res);

    }

}
