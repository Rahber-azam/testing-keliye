package newkeyword.statickewWords;
//we can access the static keyword without creating a new instance or object.
public class B {
    static  int a=10;

    public static void main(String[] args) {
        System.out.println(B.a);
    }
}
