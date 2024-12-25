package newkeyword.thismethod;
public class C {
    C(int a,int b){
        System.out.println(a+b);
    }
    C(String c,int d){
        System.out.println(c+d);
    }
    C(){
        System.out.println("hello");
    }
    C(int e){
        this();
    }

    public static void main(String[] args) {
        C c1= new C(10,20);
        C c2= new C("sony",30);
        C c3=new C(40);
    }
}
