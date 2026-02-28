
public class InsertionSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //Insertion Sort
        for(int i=0;i<arr.length;i++){
            int mn =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mn]){
                    mn=j;
                }
            }
            int temp = arr[mn];
            arr[mn] = arr[i];
            arr[i] = temp;
        }

        print(arr);
    }
}
