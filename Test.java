package newkeyword;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.hashCode());
        Test t2 = new Test();
        System.out.println(t2.hashCode());
    }
}
