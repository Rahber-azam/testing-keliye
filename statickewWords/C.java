package newkeyword.statickewWords;

public class C {
     int a =10;
    static  final int b=200;

    public static void main(String[] args) {
        C obj = new C();
        obj.a = 20; // changes the value of a for this instance
        System.out.println(obj.a);
        C obj2 = new C();
        System.out.println(obj2.a);// prints 10

        System.out.println(C.b);
    }
}
