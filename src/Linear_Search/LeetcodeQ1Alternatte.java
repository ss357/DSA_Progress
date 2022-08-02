package Linear_Search;

public class LeetcodeQ1Alternatte {
    public static void main(String[] args) {
        int[] arr = {12,258,12,45,100,1021,12365,56};
        System.out.println(evenDigitCounterinArray(arr));

    }
  static int evenDigitCounterinArray(int[] arr){
        int counter=0;
      for (int element:arr
           ) {
          if(isContainEvenDigit(element)){
              counter++;
          }
      }
      return counter;
  }

    private static boolean isContainEvenDigit(int element) {
        String ss= String.valueOf(element);
        int digit= ss.length();
        if(digit%2==0){
            return true;
        }
        else {return false;}

    }
}
