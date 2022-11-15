import java.util.*;
public class count {
    int n,c;
    count(){
        n=0;
        c=0;
    }
    void readValue(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the positive no");
        n=in.nextInt();
    }
    void process(){
        int t,temp;
        temp=n;
        while(temp!=0) {
            t = temp % 10;
            if (t == 0) {
                c++;
            }
            temp = temp / 10;
           // cnt++;
        }
    }
    void check(){
        if (c >= 1) {
            System.out.println("The number is a duck number");
        }
        else{
            System.out.println("The number is not a duck number");
        }
    }
    public static void main(String[] args){
        count ob =new count();
        ob.readValue();
        ob.process();
        ob.check();
    }
}
