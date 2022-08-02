package Linear_Search;
//given array of integers, return how many of them contain an even number of digits.
public class LeetcodeQ1 {
    public static void main(String[] args) {
     int[] arr = {25,45,98,123,23};
        System.out.println(evenDigitCounter(arr));


    }
    static int digitCounter(int num) {
        int counter = 0;
        while (num != 0) {
            counter++;
            num /= 10;

        }


        return counter;
    }

    static boolean isEvenDigit(int num){
        if(digitCounter(num)%2==0){
            return true;
        }


        return false;
    }


    static int evenDigitCounter(int[] arr){
        int counter=0;
        for (int element: arr
             ) {
            if(isEvenDigit(element)){counter++;};
        }
        return counter;
    }

}

