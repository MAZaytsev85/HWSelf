package HW4;

// С заботой о природе

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество посетителей");
        int value = 0;
        int error = 0;
        for (int i = 0; i <= 5; i++) {
            int s = in.nextInt();
                System.out.println("Людей в 3" + value +"-м секторе " + s);
                value++;
            if (s > 10) {
                error++;
                System.out.println("Нарушение! Слишком много людей в секторе!");
            } else System.out.println("Всё спокойно.");
        }
                System.out.println("Колличество нарушений " + error);
    }

}