public class LinearProbing {

    static int[] linearProbing(int h_size, int arr[], int n)
    {
        int hash[] = new int[h_size];
        
        for(int i=0;i<h_size;i++)
            hash[i]=-1;
        
        int size = h_size;
        
        for(int i=0;i<n;i++){
            if(size==0) return hash;
            int key = arr[i];
            int hash_key = key%h_size;
            while(hash[hash_key]!=-1&&size>0)
                hash_key=(hash_key+1)%h_size;
            hash[hash_key] = key;
            size--;
        }
        return hash;
    }

    public static void main(String[] args) {
        int arr[] = {4,14,24,44,13,61,55};
        int n = arr.length;
        int h_size = 10;
        int res[] = linearProbing(h_size,arr,n);
        for(int i=0;i<h_size;i++){
            System.out.print(res[i]+" ");
        }
    }
}
