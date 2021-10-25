package HW2;

import java.util.Scanner;

// Хватит ли зарплаты


public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество отработанных часов");
        int time = scanner.nextInt();
        System.out.println("Введите остаток по кредиту");
        int credit = scanner.nextInt();
        System.out.println("Введите количество денег на еду");
        int cashRest = scanner.nextInt();
        double cashPay = 200 * time / Math.pow(2,3) + time;
        if (cashPay >= credit + cashRest) {
            System.out.println("Часов хватает. Можно отдохнуть");
        } else {
            System.out.println("Часов не хватает. Придётся работать!");
        }
    }
}
