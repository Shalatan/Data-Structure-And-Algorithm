package Solutions;

import java.util.*;

public class ValidAnagram {
    
    //my approach
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        System.out.println(hash);
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(hash.containsKey(c)){
                int f = hash.get(c)-1;
                hash.put(c,f);
                if(f==0){
                    hash.remove(c);
                }
            }else{
                return false;
            }
        }
        System.out.println(hash);
        return hash.isEmpty();
    }


    //optimized
    public boolean isAnagramm(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i=0;i<s.length();i++){
            if(sArray[i] != tArray[i]) return false;
        }
        return true;
    }
}
