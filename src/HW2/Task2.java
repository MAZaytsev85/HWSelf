package HW2;
import java.util.Scanner;

//Погода switch


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показания датчика 0 или 1");
        int weather = scanner.nextInt();
        switch (weather) {
            case 1:
                System.out.println("Пошёл дождь. Возьмите зонтик!");
                break;
            case 0:
                System.out.println("Дождя нет");
                break;
        }

    }
}
