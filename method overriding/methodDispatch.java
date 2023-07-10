class BaseClass {
    public void display() {
        System.out.println("BaseClass display() called.");
    }
}

class ChildClass extends BaseClass {
    public void display() {
        System.out.println("ChildClass display() called.");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass base_obj = new BaseClass();
        ChildClass child_obj = new ChildClass();

        base_obj.display(); // Calls BaseClass display() method
        child_obj.display(); // Calls ChildClass display() method

        base_obj = new ChildClass(); // Base class reference variable pointing to child class object
        base_obj.display(); // Calls ChildClass display() method
    }
}
