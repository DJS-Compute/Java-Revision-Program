class A {
    int a;
    public A(int a) {
        this.a = a;
        System.out.println("Constructor of class A");
    }
}
class B extends A {
    int b;
    public B(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Constructor of class B");
    }
}
class C extends B {
    int c;

    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Constructor of class C");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        C obj = new C(10, 20, 30);
        System.out.println("Values: " + obj.a + ", " + obj.b + ", " + obj.c);
    }
}
