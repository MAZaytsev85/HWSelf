package HW1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите семизначное число");
        int number = scanner.nextInt();

        int a = number / 1000000;
        //    System.out.println(a);
        int e = number % 1000000 / 100000;
        //   System.out.println(e);
        int b = number % 1000000 % 100000 / 10000;
        //  System.out.println(b);
        int f = number % 1000000 % 100000 % 10000 / 1000;
        //    System.out.println(f);
        int c = number % 1000000 % 100000 % 10000 % 1000 / 100;
        //  System.out.println(c);
        int g = number % 1000000 % 100000 % 10000 % 1000 % 100 / 10;
        //   System.out.println(g);
        int d = number % 10;
        //   System.out.println(d);
        int result1 = a + b + c + d;
        System.out.println(result1);
        int result2 = e + f + g;
        System.out.println(result2);
        int result3 = a * e + b * f + c * g + f;
        System.out.println(result3);


        System.out.println("Введите первое двухзначное число");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе двухзначное число");
        int number2 = scanner.nextInt();
        int m = number1 / 10;
        int n = number2 / 10;
        int result4 = m + n;
        System.out.println("Ответ 1: " + result4);
        int k = number1 % 10;
        int l = number2 % 10;
        int result5 = k +l;
        System.out.println("Ответ 2: " + result5);

    }
}
