package HW4;

import java.util.Scanner;
// Должники

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер клиента");
        int value = 0;
        for (int i = 1; i <= 10; i++) {
        int id = in.nextInt();
            if (id % 2 == 0 && id > 0) {
                value++;

            }
        } System.out.println(value);
    }
}
