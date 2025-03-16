import java.util.Random;
import java.util.Scanner;
class GuessNum{
    Random rand=new Random();
    int num=rand.nextInt(1,10);
    public void guessnumber() {
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        if (guess == num) {
            System.out.println("Congratulations!You guessed it");
        } else if (guess >= num) {
            System.out.println("too high!try again");
            guessnumber();
        } else {
            System.out.println("too low!try again");
            guessnumber();
        }

    }
}
public class GuessGame{
    public static void main(String[] args) {
        GuessNum g=new GuessNum();
        g.guessnumber();
    }
}
