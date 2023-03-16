package HW_J3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее ариф. из этого списка.
 */
public class Ex_3 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0, 12));
        }
        return newArray;
    }

    public static void EndValue(ArrayList<Integer> nArray) {
        nArray.sort(Comparator.naturalOrder());
        System.out.println("Максимальный элемент -> " + nArray.get(nArray.size() - 1));
        nArray.sort(Comparator.reverseOrder());
        System.out.println("Минимальный элемент -> " + nArray.get(nArray.size() - 1));

        int sum = 0;
        for (int i = 0; i < nArray.size(); i++) {
            sum += i;
        }
        int averge = sum / nArray.size();
        DecimalFormat dF = new DecimalFormat("#.##");
        String res = dF.format(averge);
        System.out.println("Среднее арифмитическое -> " + res);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nArray = GetRandomArray(10);
        System.out.println(nArray);
        EndValue(nArray);
    }
}
