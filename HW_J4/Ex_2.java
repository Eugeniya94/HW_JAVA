package HW_J4;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Ex_2 {
    
    public static void Enqueue(LinkedList<String> list, String el){
        list.addLast(el);
    }
    public static String Dequeue(LinkedList<String> list){
        return list.removeFirst();
    }
    public static String First(LinkedList<String> list){
        return list.getFirst();
    }


    public static void main(String[] args) {
              
            LinkedList<String> list = new LinkedList<>();
            list.add("sun");
            list.add("sea");
            list.add("sky");
            Integer flag=1;
            System.out.println(flag);

            Scanner sc = new Scanner(System.in); 

            while(flag==1){ 
                
                System.out.println("Введите команду: \n 1-добавить элемент в конец очереди;\n 2-возвратить первый элемент из очереди и удалить его;\n 3-возвратить первый элемент из очереди и не удаляя его."); 
                String text = sc.nextLine(); 
                if(text.equals("1")){ 
                    System.out.println("Введите элемент,который хотите добавить:");
                    String element = sc.nextLine(); 
                    Enqueue(list, element);
                    System.out.println(list); 
                } 
                else if(text.equals("2")){ 
                System.out.println(Dequeue(list));
                System.out.println(list);               
                }
                else if(text.equals("3")){ 
                    System.out.println(First(list)); 
                    System.out.println(list);              
                }
                else { 
                    System.out.println("Error"); 
                }
                System.out.println("Хотите продолжить? 1-да 2-нет");
                flag = Integer.parseInt (sc.nextLine()); 
                                
            }     
            sc.close();
                       
    }
}
