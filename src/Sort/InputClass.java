package Sort;

import Sort.BubbleSort;
import Sort.InsertionSort;
import Sort.SelectionSort;
import Sort.QuickSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
    public static void main(String[] args){
        int n=0,ch = 0;
        Scanner in =new Scanner(System.in);
        try{
            System.out.println("Enter the limit");
            n=in.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }

        int[] arr=new int[n];
        try{
            System.out.println("Enter array elements");
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            System.out.println("Enter your choice.\n1.For Bubble Sort.\n2.For Selection Sort.\n3.For Insertion Sort.\n4.For QuickSort");
            ch=in.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        switch (ch) {
            case 1:
                BubbleSort ob = new BubbleSort(arr);
                ob.setArr(arr);
                arr = ob.Sorting_Array(ob.getArr());
                ob.ArrayDispay(arr);
                break;
            case 2:
                SelectionSort ob1 = new SelectionSort(arr);
                ob1.setArr(arr);
                arr = ob1.Sorting_Array(ob1.getArr());
                ob1.ArrayDispay(arr);
                break;
            case 3:
                InsertionSort ob2 = new InsertionSort(arr);
                ob2.setArr(arr);
                arr = ob2.Sorting_Array(ob2.getArr());
                ob2.ArrayDispay(arr);
                break;
            case 4:
                QuickSort ob3 = new QuickSort(arr);
                ob3.setArr(arr);
                ob3.Sorting_Array(ob3.getArr());
                QuickSort.ArrayQuickSort(ob3.getArr(),0,n-1);
                ob3.ArrayDispay(ob3.getArr());
                break;
            default:
                System.out.println("Wrong choice Try Again");
        }
    }
}
