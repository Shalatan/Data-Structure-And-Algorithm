public class QuadraticProbing {

    static int[] quadraticProb(int hash_size, int arr[], int n)
    {
        int hash[] = new int[hash_size];
        
        for(int i=0;i<hash_size;i++)
            hash[i]=-1;

        for(int i=0;i<n;i++){
            int key = arr[i]%hash_size; 
            int j=1;
            while(hash[key]!=-1){
                key = (arr[i]+(j*j))%hash_size;
                j++;
            }
            hash[key] = arr[i];
        }
        return hash;
    }

    public static void main(String[] args) {
        int arr[] = {21,10,32,43};
        int n = arr.length;
        int h_size = 11;
        int res[] = quadraticProb(h_size,arr,n);
        for(int i=0;i<h_size;i++){
            System.out.print(res[i]+" ");
        }
    }
}
