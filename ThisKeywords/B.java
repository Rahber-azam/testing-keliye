package newkeyword.ThisKeywords;

public class B {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b);
        B b1=new B();
        System.out.println(b1);
        B b2=new B();
        System.out.println(b2);
        B b3=new B();
        System.out.println(b3);

    }
    public void bolls(){
        System.out.println(this.hashCode());
    }
}
