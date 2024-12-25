package newkeyword.ThisKeywords;
//This keyword point to the current object running in the program.
public class A {
    public static void main(String[] args) {
        A a=new A();
        a.test();
        System.out.println(a.hashCode());
    }
    public void test(){
        System.out.println(this.hashCode());
    }
}
