package Sort;
import Sort.Sorting;
public class QuickSort extends Sorting{
    QuickSort(int[] arr){
        super(arr);
    }
    public static void ArrayQuickSort(int[] arr, int low, int high) {
        int mid=(low+high)/2;
        int i=low;
        int j=high;
        int pivot=arr[mid];
        while(i <=j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (low < j) {
                ArrayQuickSort(arr, low, j);
            }
            if (high > i) {
                ArrayQuickSort(arr, i, high);
            }
        }
    }

    @Override
    int[] Sorting_Array(int[] arr) {
        return new int[0];
    }
}
