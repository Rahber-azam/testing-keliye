package newkeyword.thismethod;

public class B {
    B(){
        System.out.println(100);
    }
    B(int a){

        this();
        System.out.println(200);
    }
    B(int b, String c){
        System.out.println(300);

    }

    public static void main(String[] args) {
        B x=new B(5);
        B x1=new B(4,"name");
    }
}
