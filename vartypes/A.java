package newkeyword.vartypes;
// In version 10 of java var type is introduce.
// When a variable is created with the type var, then it means you can
//store any kind of value in it.
// Var type allocate the data type to the variable dynamically, depending
//on the value to store in the data type.
// A variable with the type var cannot be static and non-static, it can only
//be local variable
public class A {
    public static void main(String[] args) {
        var a1=10;
        var a2="name";
        var a3=10.3;
        var a4=true;
        var a5=new A();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

    }
}
