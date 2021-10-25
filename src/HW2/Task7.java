package HW2;

import java.util.Scanner;

// Модуль числа (вариант 2)


public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int module = scanner.nextInt();
        if (module < 0) {
            int module1 = module * -1; {
            } System.out.println(module1);
        } else {
            System.out.println(module);
        }
    }
}
