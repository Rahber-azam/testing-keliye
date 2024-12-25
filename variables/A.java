package newkeyword.variables;

public class A {
    public static void main(String[] args) {
        int a=10;//local variable
        A a1=new A();
        System.out.println(a);
        a1.Test();

    }
    public void Test(){
        int b=12;
        System.out.println(b);
    }
}
