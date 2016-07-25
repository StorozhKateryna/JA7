package homework.data160721;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Есть строка «АА1458АВ». Вытянуть из нее в разные переменные текст (2-е переменные) и цифры (1-на
 * переменная).
 * нам не известно сколько символов текстовых и сколько цифр (например: «тел.:234-59-02, тел.моб.: +38 067
 * 333 33 33»), нужно что бы текст был в одной переменной, а цифры во второй, если после цифр идет опять текст
 * он также вносится в свою переменную и т.д
 */
public class ReshEx1 {
    public static void main(String[] args) {
        String s = "тел.: 234-59-45, тел.моб.: +38 067 333 33 33";
        String[] str = new String[20];
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
        }
        String myPattern = "[\\+]{0,1}([0-9]{1,3}[\\ ]{0,1}[\\-]{0,1}){3,5}";//любой одиночный символ который не являеться тем, что в скобках
        Pattern mySplitter = Pattern.compile(myPattern);// Создаем паттерны
        Matcher m = mySplitter.matcher(s);// Метод Matcher () проверяем строку на соответствие регулярному выражению
        int count = 0;

        while (m.find()) {
            str[count] = m.group();
            count++;
        }
        System.out.println(Arrays.toString(str));
    }
}