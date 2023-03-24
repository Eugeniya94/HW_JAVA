package final_test;

import java.util.HashMap;
import java.util.Map;

public class Notebook1 extends BaseNotebook {

    public Notebook1(int ramSize, int driveSize, String osType, String color) {
        super(ramSize, driveSize, osType, color);
    }
    
    public static Map<Integer, Notebook1> listOfNotes() {
    
        Map<Integer, Notebook1> mapNotes1 = new HashMap<>();
        Notebook1 note1 = new Notebook1(1, 128, "Win 10", "black");
        Notebook1 note2 = new Notebook1(2, 256, "Win 10", "black");
        Notebook1 note3 = new Notebook1(2, 256, "Win 11", "white");
        Notebook1 note4 = new Notebook1(4, 256, "Win 11", "grey");
        Notebook1 note5 = new Notebook1(4, 512, "Win 11", "black");
        Notebook1 note6 = new Notebook1(8, 512, "Win 11", "red");
        Notebook1 note7 = new Notebook1(8, 512, "Win 11", "black");
        Notebook1 note8 = new Notebook1(16, 1024, "Linux", "red");
        mapNotes1.put(1, note1);
        mapNotes1.put(2, note2);
        mapNotes1.put(3, note3);
        mapNotes1.put(4, note4);
        mapNotes1.put(5, note5);
        mapNotes1.put(6, note6);
        mapNotes1.put(7, note7);
        mapNotes1.put(8, note8);
        System.out.println("список доступных моделей ноутбуков (ОЗУ, объём SSD, операционная система, цвет) ");
        System.out.println(mapNotes1);
        return mapNotes1;
    }

    @Override
    public String toString() {
        return (" ramSize " + ramSize + " ГБ " + " | driveSize  " + driveSize + " ГБ " + " | osType \t" + osType + " | color \t" + color + "\n");
    }
}