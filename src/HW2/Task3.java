package HW2;

import java.util.Scanner;

//Поступление

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите баллы по Русскому языку");
        int score1 = scanner.nextInt();
        System.out.println("Введите баллы по Математике");
        int score2 = scanner.nextInt();
        System.out.println("Введите баллы по Информатике");
        int score3 = scanner.nextInt();
        if (score1 + score2 + score3 >= 270) {
            System.out.println("Поздравляю, ты поступил на бюджет!");
        } else {
            System.out.println("К сожалению, ты не прошёл на бюджет.");
        }
    }
}
