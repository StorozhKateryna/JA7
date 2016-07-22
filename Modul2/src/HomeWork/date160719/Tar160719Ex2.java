package HomeWork.date160719;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Игорь on 19.07.2016.
 */
public class TarEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите строку:");
        String str = scan.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            sb.insert(0,str.charAt(i));
        }
        System.out.println("Отзеркаленная строка:\n" +sb);
    }
}
