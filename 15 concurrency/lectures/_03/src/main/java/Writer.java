import java.util.Random;

public class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {
                "And be very careful crossing the streets.",
                "How fair entrance breaks the way to love!",
                "Left, doors leading into the apartments.",
                "Just then a light flashed from the cliff above.",

                "The fields near the house were invisible.",
                "Objects of alarm were near and around.",
                "The window had only stuck a little.",
                "From the big apple tree down near the pond.",

                "The large cabin was in total darkness.",
                "Come marching up the eastern hill afar.",
                "When is the clock on the stairs dangerous.",
                "Everything seemed so near and yet so far.",

                "Behind the wall silence alone replied.",
                "Was, then, even the staircase occupied?"
        };
        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ignored) {}
        }
        message.write("Finished");
    }
}
