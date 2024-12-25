package newkeyword.Constructors;
//CONSTRUCTOR OVERLOADING means when we create more than one constructor with  different no of argument or parameter
public class C {
    C(){
        System.out.println(100);
    }
    C(int a){
        System.out.println(a);
    }
    C(int b ,String c){
        System.out.println(b+" "+c);
    }

    public static void main(String[] args) {
        C c3= new C();
        C c1=new C(10);
        C c2= new C(20,"cat");
    }
}
