package newkeyword.Constructors;
// A constructor should have same name as that of class
// Whenever it creates object constructor will be called automatically
// Constructors are permanently void
// Because constructors are void and cannot return any value
public class A {
    A(){
        System.out.println(100);
        System.out.println("hello");
    }

    public static void main(String[] args) {
        A a= new A();
        A a1= new A();
    }
}
