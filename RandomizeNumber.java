import java.util.Random;

public class RandomizeNumber {

    Random random = new Random();

    public void display(int randomNumber) {
        randomNumber = random.nextInt(100);
        for (int i = 0; i < 50; i++) {
            System.out.print("\t" + randomNumber);
        }
    }
}
