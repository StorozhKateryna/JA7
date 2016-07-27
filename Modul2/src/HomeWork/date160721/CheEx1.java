package HomeWork.date160721;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
        }

        String myPattern = "[0-9]{1,4}";
        String myPattern1 = "[a-zA-z]{1,4}";

        Pattern mySplitter = Pattern.compile(myPattern);
        Pattern mySplitter1 = Pattern.compile(myPattern1);

        Matcher m = mySplitter.matcher(s);
        Matcher m1 = mySplitter1.matcher(s);
        int count = 0;

        while (m.find()) {
            str[count] = m.group();
            count++;
        }
        while (m1.find()) {
            str[count] = m1.group();
            count++;
        }
        System.out.println(Arrays.toString(str));
    }
}


