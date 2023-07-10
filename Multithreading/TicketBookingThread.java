class TicketBookingThread extends Thread {
    private static int availableSeats = 10;
    private int seatsToBook;

    public TicketBookingThread(int seatsToBook) {
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
        synchronized (TicketBookingThread.class) {
            if (availableSeats >= seatsToBook) {
                System.out.println(Thread.currentThread().getName() + " booked " + seatsToBook + " seat(s).");
                availableSeats -= seatsToBook;
            } else {
                System.out.println(Thread.currentThread().getName() + " could not book " + seatsToBook + " seat(s).");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingThread thread1 = new TicketBookingThread(5);
        TicketBookingThread thread2 = new TicketBookingThread(4);
        TicketBookingThread thread3 = new TicketBookingThread(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
