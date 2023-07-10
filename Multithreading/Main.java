class TableThread extends Thread {
    private int num;

    public TableThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TableThread thread1 = new TableThread(5);
        TableThread thread2 = new TableThread(7);
        TableThread thread3 = new TableThread(13);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
