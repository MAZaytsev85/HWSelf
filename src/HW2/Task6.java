package HW2;

import java.util.Scanner;

// Модуль числа

public class Task6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int module = scanner.nextInt();
            if (module < 0) {
                int module1 = - module; {
                } System.out.println(module1);
            } else {
                System.out.println(module);
            }
        }
}
