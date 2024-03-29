package HW_J3;
/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

import java.util.ArrayList;
import java.util.Random;

public class Ex_2 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0,11));
        }
        return newArray;
    }
    

    public static void main(String[] args){
        ArrayList<Integer> nArray =  GetRandomArray(10);
        System.out.println(nArray);
        for (int i = nArray.size()-1; i >= 0; i--) {
            if(nArray.get(i)%2 == 0){
                nArray.remove(i);
            }
        }
        System.out.println(nArray);
}
}
