package homeWork.date160722;

import java.util.Scanner;

/**
 * Created by СНЕ on 24.07.2016.
 */

//Есть строка «АА1458АВ». Вытянуть из нее в разные переменные текст (2-е переменные) и цифры (1-на
//        переменная).
//        *нам не известно сколько символов текстовых и сколько цифр (например: «тел.:234-59-02, тел.моб.: +38 067
//        333 33 33»), нужно что бы текст был в одной переменной, а цифры во второй, если после цифр идет опять текст
//        он также вносится в свою переменную и т.д.

public class CheEx1 {
    public static void main(String[] args) {
        String s = "AA1458AB";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)));{
            System.out.println(s.charAt(i));}

        }
    }
}

