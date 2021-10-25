package HW2;

import java.util.Scanner;

// Банкомат

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите снять:");
        int cash = scanner.nextInt();
        int money = cash % 100;
        if (money == 0) {
            System.out.println("Возьмите ваши деньги");
        } else {
            System.out.println("Такую сумму снять невозможно. Обратитесь в другой банкомат");
        }
    }
}
