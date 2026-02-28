public class MergeSort {
    public static void merge(int arr[], int low, int mid, int high){
        int merged[] = new int[high-low+1];
        int idx1  = low;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <=high){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= high){
            merged[x++] = arr[idx2++];
        }
        for(int i=0, j=low; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void mergedSort(int arr[], int low, int high){
        if(low < high){
            int mid = low +(high-low)/2;
            mergedSort(arr, low, mid);
            mergedSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 45, 2, 5};
        mergedSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}