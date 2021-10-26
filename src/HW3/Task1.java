package HW3;

//Факториал

import java.util.Scanner;

public class Task1 {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральнео число");
        int value = in.nextInt();
        int f = 1;
        for (int n = 1; n <= value; n++) {
            f = f * n;
        }
        System.out.println(f);
    }
}



