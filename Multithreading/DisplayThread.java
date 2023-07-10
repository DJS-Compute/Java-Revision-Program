class DisplayThread extends Thread {
    private String symbol;

    public DisplayThread(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 8; i++) {
            System.out.print(symbol + " ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DisplayThread thread1 = new DisplayThread("/");
        DisplayThread thread2 = new DisplayThread("*");

        thread1.start();
        thread2.start();
    }
}
