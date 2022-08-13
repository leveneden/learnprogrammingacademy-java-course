public class Countdown {

    private int i;

    public void doCountdown() {
        final String color;
        final String threadName = Thread.currentThread().getName();

        switch (threadName) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + threadName + ": i = " + i);
        }
    }
}
