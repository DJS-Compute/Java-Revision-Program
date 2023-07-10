class FibonacciThread extends Thread {
    private int count;
    private long[] fibSequence;

    public FibonacciThread(int count) {
        this.count = count;
        fibSequence = new long[count];
    }

    @Override
    public void run() {
        fibSequence[0] = 0;
        if (count > 1) {
            fibSequence[1] = 1;
            for (int i = 2; i < count; i++) {
                fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            }
        }
    }

    public long[] getFibSequence() {
        return fibSequence;
    }
}

public class Input {
    public static void main(String[] args) {
        int count = 10;
        FibonacciThread fibonacciThread = new FibonacciThread(count);
        fibonacciThread.start();

        try {
            fibonacciThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long[] fibSequence = fibonacciThread.getFibSequence();

        System.out.println("Fibonacci Sequence:");
        for (long num : fibSequence) {
            System.out.print(num + " ");
        }
    }
}
