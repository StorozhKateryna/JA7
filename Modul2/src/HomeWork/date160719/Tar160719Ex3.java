package HomeWork.date160719;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Игорь on 19.07.2016.
 */
public class TarEx3 {
    public static void main(String[] args) {
        String fio = " сиДОренко ИваН сТЕпанович";
        System.out.println("Исходная строка: " + fio);
        StringBuilder fio2 = new StringBuilder();
        StringBuilder firstLetters = new StringBuilder();
        int index = 0;
        for (int i = 0; i <fio.length() ; i++) {
            if(i==index) {
                fio2.append(Character.toTitleCase(fio.charAt(i)));
                firstLetters.append(fio2.charAt(i));
                index = fio.indexOf(" ",index) + 1;
                if(index!=1)firstLetters.append(". ");
            }
            else fio2.append(Character.toLowerCase(fio.charAt(i)));
        }
        System.out.println("Ф.И.О: " + fio2);
        System.out.println("Инициалы: " + firstLetters);
    }
}
