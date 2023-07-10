final class ExampleClass {
    public static final int CONSTANT_VALUE = 100;

    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }
}

final class FinalClass {}

// Error: Cannot inherit from final class 'FinalClass'
// class SubClass extends FinalClass {}

public class Main {
    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        obj.finalMethod();

        // Error: Cannot assign a value to final variable 'CONSTANT_VALUE'
        // obj.CONSTANT_VALUE = 200;
    }
}

