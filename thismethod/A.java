package newkeyword.thismethod;
// here i not use this method next program i use this method
public class A {
    A(int b){
        System.out.println(b);
    }
    A(int c,String d){
        System.out.println(c+d);
    }
    A(){
        System.out.println(100);
    }

    public static void main(String[] args) {
        A a= new A(10);
        A d= new A(20,"hello");
        A x=new A();
    }
}
