package HW2;
import java.util.Scanner;

// Калькулятор скидки


public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость первого стула");
        int price1 = scanner.nextInt();
        System.out.println("Введите стоимость второго стула");
        int price2 = scanner.nextInt();
        System.out.println("Введите стоимость третьего стула");
        int price3 = scanner.nextInt();
        int bill = price1 + price2 + price3;
        if (bill > 10000) {
            int billSale = bill - (bill * 10 / 100);
            System.out.println(billSale);
        } else {
            System.out.println(bill);
        }
    }
}
