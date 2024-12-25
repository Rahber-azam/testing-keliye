package newkeyword.ThisKeywords;

public class C {
    int a=10;

    public static void main(String[] args) {
        C c= new C();
        c.test();
        System.out.println(c.a);
    }
    public void  test(){
        System.out.println(this.a);
    }
}
