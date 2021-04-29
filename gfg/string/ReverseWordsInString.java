public class ReverseWordsInString {
    static String reverseWords(String s) {
        String[] arr = s.split("\\.");
        String ans = "";
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            ans += arr[i] + ".";
        }
        ans += arr[0];
        return ans;
    }

    public static void main(String[] args) {
        String s = "elon.musk.is.alien";
        String a = reverseWords(s);
        System.out.println(a);
    }
}
