package Solutions;

import java.util.*;

public class ValidParanthesis {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(isMatching(stack.peek(),c)==false){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    
    boolean isMatching(char a, char b){
        return ((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
    }

}
