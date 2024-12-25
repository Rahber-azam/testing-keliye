package newkeyword.statickewWords;
//Static keywords->inside the class but outside the main method by using static keywords.
//and accessing static keywords with class names;
public class A {
    int a=10;
    static int c=23;
    static int b=20;
    String n="sonu";

    public static void main(String[] args) {
        A a1= new A();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.n);
        System.out.println(A.c);
    }
}
