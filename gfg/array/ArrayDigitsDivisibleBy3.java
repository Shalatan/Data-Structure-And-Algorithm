//Find if number formed by digits of array is divisible by 3
//ex = {40,50,90} - 405090 (is divisible by 9, so return 1)

public class ArrayDigitsDivisibleBy3
{
static int isPossible(int N, int arr[]){
    int totalSum = 0;
    for(int i=0;i<N;i++){
        while(arr[i]>0){
            totalSum += arr[i]%10;
            arr[i] /= 10;
        }
    }
    if(totalSum%3==0) return 1;
    else return 0;
}
public static void main(String[] args){
    int arr[] = {40, 50, 90};
    int n = arr.length;
    System.out.println("Array");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("");
    int m = isPossible(n,arr);
    System.out.println("Answer "+m);
}   
}
