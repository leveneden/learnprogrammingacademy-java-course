public class Main {
    public static void main(String[] args) {
        Thread anotherThread = new AnotherTread();
        anotherThread.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    anotherThread.join(5000);
                } catch (InterruptedException e) {
                    // exception handling
                }
            }
        }).start();
    }
}
