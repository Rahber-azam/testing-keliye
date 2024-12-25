package newkeyword.ThisKeywords;

public class Test {
//this keyword reffers to the current class objects.
    Test(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test t= new Test(10);
        t.cat();
    }
    public void cat(){
        System.out.println(this);
    }

}
