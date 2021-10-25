package HW2;
import java.util.Scanner;

//Погода

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показания датчика 0 или 1");
        int weather = scanner.nextInt();
        if (weather == 1) {
            System.out.println("Пошёл дождь. Возьмите зонтик!");
        } else if (weather == 0) {
            System.out.println("Дождя нет");
        } else {
            System.out.println("введено неверное значение");
        }

    }
}
