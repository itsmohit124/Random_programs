import java.util.Scanner;

public class DD2 {
    int z;
    int A[]=new int[100];
    DD2(int s){
        z=s;
    }
    void Read(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to the array");
        for(int i=0;i<z;i++)
        {
            A[i]=in.nextInt();
        }
    }
    void Sort(){
        for(int i=0;i<z;i++)
        {
            for(int j=0;j<z-i;j++)
            {
                if(A[j]<A[j+1])
                {

                    int t=A[j];

                    A[j]=A[j+1];

                    A[j+1]=t;
                }
            }
        }
    }
    void Display(){
        System.out.println("Array After sorting");
        for(int i=0;i<z;i++){
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args){
        DD2 ob=new DD2(5);
        ob.Read();
        ob.Sort();
        ob.Display();
    }
}
