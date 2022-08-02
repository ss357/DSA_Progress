package Linear_Search;

public class SearchChar {
    static int charSearch(String s,char c){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==c){
                return i;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        String ss = "I am SSS";
        int result = charSearch(ss,'S');
        System.out.println(result);
    }
}
