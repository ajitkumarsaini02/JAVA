public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i =low - 1;
        for(int j=low;j<high;j++){
            if(pivot >arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 45, 2, 5};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
