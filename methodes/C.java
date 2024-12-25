package newkeyword.methodes;
//none static method
public class C {
    public static void main(String[] args) {
        C c1=new C();
        c1.add();
        C.demo();
    }
    public void add(){
        System.out.println("this is none static method");
    }
    public static void demo(){
        System.out.println("this is static method");
    }
}
