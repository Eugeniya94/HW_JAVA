package HW_J2;

import java.io.BufferedReader;
import java.io.FileReader;
/*
 * Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

public class Ex_2 {
    public static void main(String[] args) throws Exception {

        String mainFile = "file.txt";
        String[] colTable;
        StringBuilder sb = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(mainFile))) {
			String line;
            while ((line = reader.readLine()) != null) {
                colTable = line.replace("\"", "").split(":|,");
				sb.append("Студент ").append(colTable[1]).append(" получил ").append(colTable[3]).append(" по предмету ").append(colTable[5]).append(".\n");
			}
            System.out.println(sb);
		}
                catch (Exception e) {
			e.printStackTrace();
		}
    }
}
