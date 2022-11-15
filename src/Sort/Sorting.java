package Sort;

public abstract class Sorting {
    private int[] arr;
    Sorting(){
        arr = new int[0];
    }
    Sorting(int[] arr){
        this.arr = arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int[] getArr(){
        return arr;
    }
    abstract int[] Sorting_Array(int[] arr);

    public void ArrayDispay(int[] arr){
        System.out.println("The Sorted array is");
        try {
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[j]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
