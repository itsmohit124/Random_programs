package Sort;

import Sort.Sorting;

public class InsertionSort extends Sorting {
    InsertionSort(int[] arr){
        super(arr);
    }

    @Override
    int[] Sorting_Array(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        return arr;
    }
}