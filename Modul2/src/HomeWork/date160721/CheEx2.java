package HomeWork.date160721;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by СНЕ on 24.07.2016.
 */

//Дан текст: «Достоинствами электронной почты являются: легко воспринимаемые и запоминаемые
//        человеком адреса вида имя_пользователя@имя_домена (например, somebody@example.com,
//        cool.mail@habrahabr.ru!); возможность передачи как простого текста, так и форматированного, а также
//        произвольных файлов; независимость серверов (в общем случае они обращаются друг к другу
//        непосредственно); достаточно высокая надёжность доставки сообщения; простота использования человеком и
//        программами. Автор: mymail@g.ua. »
//        Используя split создать массив String-ов и после ряда проверок (какие они будут решать вам) нужно получить
//        на выходе массив в котором хранятся почтовые адреса.

public class CheEx2 {
    public static void main(String[] args) {
        String s = "Достоинствами электронной почты являются: легко воспринимаемые и запоминаемые человеком " +
                "адреса вида имя_пользователя@имя_домена (например, somebody@example.com cool.mail@habrahabr.ru!); " +
                "возможность передачи как простого текста, так и форматированного, а также произвольных файлов; " +
                "независимость серверов (в общем случае они обращаются друг к другу непосредственно); достаточно " +
                "высокая надёжность доставки сообщения; простота использования человеком и программами. Автор: mymail@g.ua. ";

//        String[] str = new String[20];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = "";
//        }

        String [] str = s.split(" +");
        String [] res = new String[20];

        String myPattern ="[a-zA-Z.]+@[a-zA-Z0]+.[a-z]{2,3}";

        Pattern mySplitter = Pattern.compile(myPattern);
        Matcher m = mySplitter.matcher(s);
        int count = 0;

        while (m.find()) {
            res[count] = m.group();
            count++;
        }
        System.out.println(Arrays.toString(res));
    }
}
