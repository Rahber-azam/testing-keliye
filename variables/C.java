package newkeyword.variables;

public class C {
    static int id=12;//static variable
    int a=14;//none static

    public static void main(String[] args) {
        int c=45; //local variable
        System.out.println(id);
        C c1=new C();
        System.out.println(c1.a);
        System.out.println(c);

    }

}
