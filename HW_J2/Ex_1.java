package HW_J2;

 import java.util.Arrays;
 import java.io.*;
/**
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
public class Ex_1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = getRandomNumber();
        }

        for (int i = 0; i < arr.length; i++) {
            logArray(arr);
            
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static void logArray(int[] array) {

        String arrayString = Arrays.toString(array);
        System.out.print(arrayString);
        System.out.print("\n");

        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.append(arrayString);
            writer.append("\n");
            writer.flush();
        } catch (IOException ex) {

        }
    }
    
}