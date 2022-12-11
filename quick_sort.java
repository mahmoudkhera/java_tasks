

public class quick_sort {
    public static void main(String[] args) {

      int arr[] =new int[] {1,2,6,9,10,12,4,3,5,0};

    quickSort(arr,0,9);

      for(int x:arr)
        {
           System.out.print(x+" ");
        }
    }
    // function to swap two element of the array
     static void  swap(int arr[],int a, int b)
     {
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
     }
     /*method to place all the small element left the pivot
     and all the large element right
     */
    static int partation (int []arr,int low,int high) {
        int pivot = arr[high];
        int i = low; // index of the smaller element in the subarray

        for (int j = low; j <= high; j++)  //
        {
            if (arr[j] < pivot) // if the current element is smaller than the pivot
            {
                swap(arr,i, j);
                i++;
            }


        }
        swap(arr,i, high);
        return i; // the index of the pivot after the arrangement
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) // this mean do the recursion util there is one element in the subarray
        {
            int pivot_index = partation(arr, low, high);

            quickSort(arr, low, pivot_index - 1); //the subarray in the left of pivot
            quickSort(arr, pivot_index + 1, high); // the subarray in the right of pivot
        }
    }

}