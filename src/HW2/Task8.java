package HW2;
import java.util.Scanner;

// Игра в кубики

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Кубик Кости");
        int score1 = scanner.nextInt();
        System.out.println("Кубик владельца");
        int score2 = scanner.nextInt();

        if (score1 >= score2) {
            int payOut = score1 - score2;
            System.out.println(payOut + "000$");
            System.out.println("Костя платит");
        } else {
            int payOut2 = score1 + score2;
            System.out.println(payOut2 + "000$");
            System.out.println("Владелец платит");
        }
        System.out.println("Игра окончена");
    }
}
