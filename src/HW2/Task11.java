package HW2;

import java.util.Scanner;

// Хватит ли зарплаты

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трёхзначное число пробега");
        int miles = scanner.nextInt();
        System.out.println("Введите число дня");
        int day = scanner.nextInt();
        int a = miles % 1000 / 100;
        int b = miles % 100 / 10;
        int c = miles % 10;
        int summMiles = a + b + c;
        if (summMiles > day) {
            System.out.println("Сброс");
            miles = 0;
            System.out.println("Пробег " + miles);
        } else {
            System.out.println("Сегодня не сломался");
            System.out.println("Пробег " + miles);
        }
    }
}
