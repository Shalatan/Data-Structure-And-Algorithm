//Buble Sort - Stable, In-place, O(n^2)
//Selection Sort - Unstable, In-place, O(n^2)
//Insertion Sort - Stable, In-place, O(n^2) Worst Case, O(n) Best Case

public class TypesOfSort1 {

    static void bubbleSort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int arr[],int n){
        for(int i=0;i<n;i++){
            int min_ind = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }

    static void InsertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5,2,6,3,7,0,4};
        int n = arr1.length;
        System.out.println("Original Array");
        printArray(arr1,n);
        System.out.println("Bubble Sort");
        bubbleSort(arr1,n);
        printArray(arr1, n);

        int arr2[] = {5,1,3,4,6,2,9,};
        int m = arr2.length;
        System.out.println("Original Array");
        printArray(arr2,m);
        System.out.println("Selection Sort");
        selectionSort(arr2,m);
        printArray(arr2,m);

        int arr3[] = {6,2,9,5,1,3,4};
        int o = arr3.length;
        System.out.println("Original Array");
        printArray(arr3,o);
        System.out.println("Selection Sort");
        InsertionSort(arr3,o);
        printArray(arr3,o);
    }

    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
