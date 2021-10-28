package HW4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count_people = in.nextInt();
        int i = 1;
    while (i <= count_people) {
        i++;
        System.out.println("Введите оценку ученика");
        int g = in.nextInt();
        if (g == 3) {
            count3++;
        } else if (g == 4) {
            count4++;
        } else if (g == 5) {
            count5++;
        } else {
            System.out.println("Введена неверная оценка");
        }
        //System.out.println(count3);
        //System.out.println(count4);
        //System.out.println(count5);
        } if (count3 > count4 && count3 > count5) {
            System.out.println("Троечников больше");
        } else if (count4 > count5 && count4 > count3) {
            System.out.println("Хорошистов больше");
        } else {
            System.out.println("Отличников больше");
        }
    }

}

