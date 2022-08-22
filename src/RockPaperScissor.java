import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int play = rand.nextInt(3);
        if (play == 0) {
            System.out.println("Rock");
        }
        else if (play == 1) {
            System.out.println("Paper");
        }
        else if (play == 2) {
            System.out.println("Scissors");
        }

    }
}
