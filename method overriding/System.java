class MyClass {
    protected void finalize() throws Throwable {
        System.out.println("Object has been deleted.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj = null;
        System.gc();
    }
}
