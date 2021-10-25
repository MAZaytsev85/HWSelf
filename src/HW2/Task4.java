package HW2;

import java.util.Scanner;

//Следим за зубами

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        int date = scanner.nextInt();
        int result = date % 2;

        if (result == 1) {
            System.out.println("Число не четное");
        } else {
            System.out.println("Число четное");
        }
    }
}
