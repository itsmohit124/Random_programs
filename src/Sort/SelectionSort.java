package Sort;

import Sort.Sorting;

public class SelectionSort extends Sorting {
    SelectionSort(int[] arr)
    {
        super(arr);
    }

    @Override
    int[] Sorting_Array(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int m=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
        }
        return arr;
    }
}
