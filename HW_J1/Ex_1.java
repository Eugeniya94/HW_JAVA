
package HW_J1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
 * (произведение чисел от 1 до n).
 */
public class Ex_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите число: ");
        int num = Integer.parseInt(iScanner.nextLine());

        int res1 = 0;
        for (int i = 1; i <= num; i++) {
            res1 = num * (num + 1) / 2;
        }
        System.out.printf("Треугольное число: %d \n", res1);

        int res2 = 1;
        for (int i = 1; i <= num; i++) {
            res2 = res2 * i;
        }
        System.out.printf("Факториал n!: %d \n", res2);
        iScanner.close();
    }

}