// Name    : Ajit Kumar Saini
// Roll No : 2400320100114
// Section : CSE 11

public class EvenOddThreads {
    private static int counter = 1;
    private static final Object lock = new Object();
    static class EvenThread implements Runnable {
        @Override
        public void run() {
            int evenNumber = 2;
            while (true) {
                System.out.println("[Even Thread] Even number: " + evenNumber);
                evenNumber += 2;
                try {
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    System.out.println("[Even Thread] Interrupted.");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
    static class OddThread implements Runnable {
        @Override
        public void run() {
            int oddNumber = 1;
            while (true) {
                System.out.println("[Odd Thread]  Odd number:  " + oddNumber);
                oddNumber += 2;
                try {
                    Thread.sleep(5000); 
                } catch (InterruptedException e) {
                    System.out.println("[Odd Thread] Interrupted.");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenThread(), "Even");
        Thread oddThread  = new Thread(new OddThread(),  "Odd");
        System.out.println("Starting Even Thread (prints every 2 seconds)...");
        System.out.println("Starting Odd Thread  (prints every 5 seconds)...");
        evenThread.start();
        oddThread.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Stopping threads after 20 seconds...");
        evenThread.interrupt();
        oddThread.interrupt();
    }
}