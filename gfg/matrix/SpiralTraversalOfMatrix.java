import java.util.*;
public class SpiralTraversalOfMatrix{

    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        ArrayList<Integer> a = new ArrayList<>();
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++)
                a.add(arr[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                a.add(arr[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    a.add(arr[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    a.add(arr[i][left]);
                left++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int matrix[][]= {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15,16}};
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println(spirallyTraverse(matrix, r, c));
    }
}