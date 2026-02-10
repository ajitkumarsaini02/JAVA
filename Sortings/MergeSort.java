public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if(left >=right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int merged[] = new int[right - left +1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <=arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= right) {
            merged[k++] = arr[j++];
        }

        for (int p = 0, q = left; p < merged.length; p++, q++) {
            arr[q] = merged[p];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
