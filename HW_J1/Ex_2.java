package HW_J1;

/*
 * Вывести все простые числа от 1 до 1000
 */

public class Ex_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.print(i + ",");

            }
        }
    }
}
