public class FrequencyInSortedArray {
      
    static void findFrequency(int arr[]){
        // int n = arr.length;
        // int freq = 1;
        // int prevElement = arr[0];
        // for(int i=1;i<n;i++){
        //     if(arr[i]==prevElement){
        //         freq++;
        //     }
        //     else{
        //     System.out.println(prevElement+" : "+freq);
        //     prevElement = arr[i];
        //     freq=1;
        //     }
        // }
        // if(n==1 || arr[n-1]!=arr[n-2]){
        //     System.out.println(arr[n-1]+" : 1");
        // }

        int n = arr.length;
        int freq = 1, i = 1;
    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1]){
    			freq++;
    			i++;
    		}
    		System.out.println(arr[i - 1] + " " + freq);
    		i++;
    		freq = 1;
    	}
    }
    public static void main(String[] args){
        int arr[] = {10,10,10,10,20,20,30,30,30};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        findFrequency(arr);
    }
}
