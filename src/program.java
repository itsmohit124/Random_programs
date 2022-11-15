public class program {
    int empno;
    final int da=48,hra=15,pf=7;
    String name;
    float basic;
    program(int empno,String name,float basic){
        this.empno=empno;
        this.name=name;
        this.basic=basic;
    }
    void calculate(){
        float gross;
        gross= basic + basic*da/100 + basic*hra/100 + basic*pf/100;
        System.out.println("Employee no- "+empno+"\tEmployee name- "+name+"\tBasic salary- "+basic+"\tGross salary- "+gross);
    }
    public static void main(String[] arg){
        program ob=new program(769,"Ramesh",8797.76f);
        ob.calculate();
    }
}
