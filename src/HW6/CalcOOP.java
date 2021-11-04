package HW6;

import java.util.Scanner;

public class CalcOOP {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = in.nextInt();
        System.out.println("Введите второе число");
        int second = in.nextInt();
        System.out.println("Введите желаемую операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int value = (char) in.nextInt();
        CalcOOPpole calcSumm = new CalcOOPpole(first, second);
        CalcOOPpole calcMin = new CalcOOPpole(first, second);
        CalcOOPpole calcMnozh = new CalcOOPpole(first, second);
        CalcOOPpole calcDel = new CalcOOPpole(first, second);
        if (value == 1) {
            System.out.println(calcSumm.getCalcSumm());
        } else if (value == 2) {
            System.out.println(calcMin.getCalcMin());
        } else if (value == 3) {
            System.out.println(calcMnozh.getCalcMnozh());
        } else if (value == 4) {
            System.out.println(calcDel.getCalcDel());
        } else {
            System.out.println("Введено неверное значение");
        }
    }
}

