package HW_J4;

import java.util.Arrays;
import java.util.LinkedList;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
 * который вернет “перевернутый” список.
 */
public class Ex_1 {
    public static LinkedList<String> Reversal(LinkedList<String> list){
        LinkedList<String> newlist = new LinkedList<>();
        for (int i=(list.size()-1);i>=0;i--) {
            newlist.add(list.get(i));
        }
        return  newlist;
    }    
    public static void main(String[] args) {
        String[] arr = new String[]{"sun", "sea", "sky", "sand","cocktail"}; 
        LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
        System.out.println(list);
        LinkedList<String> reversalist=Reversal(list);
        System.out.println(reversalist);  

    }    
    
}
