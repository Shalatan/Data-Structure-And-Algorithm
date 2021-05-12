public class ImplementstrStr {
    
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        if(m==0) return 0;
        if(n==0) return -1;
        
        for (int i=0;i<n;i++) {
            // no enough places for needle after i
            if(i+needle.length()>haystack.length()) break;
            
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
