//find char which is repeated from left
// Time Complexicity - O(n)

public class LeftMostRepeatingElement{

    static int repeatedCharacter(String S)
    {
        boolean[] visited = new boolean[256];
        int res = -1;
        for(int i=S.length()-1;i>=0;i--){
            if(visited[S.charAt(i)]){
                res = i;
            }
            else{
                visited[S.charAt(i)] = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int a = repeatedCharacter(s);
        System.out.println(s.charAt(a));
    }
}