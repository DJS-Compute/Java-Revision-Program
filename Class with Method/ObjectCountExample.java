class ObjectCounter {
    static int count = 0;

    public ObjectCounter() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class ObjectCountExample {
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        ObjectCounter.displayCount();
    }
}


