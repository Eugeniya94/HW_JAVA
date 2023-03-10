package HW_J1;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите знак: ");
        char ch = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        if (ch == '+') {
            System.out.println(num1 + num2);
        }
        else if (ch == '-') {
            System.out.println(num1 - num2);
        }
        else if (ch == '*') {
            System.out.println(num1 * num2);
        }
        if (ch == '/') {
            System.out.println(num1 / num2);
        }
    }
}
