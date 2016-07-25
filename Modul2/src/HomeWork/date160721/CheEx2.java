package homeWork.date160722;

import java.util.Arrays;

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
        String text = "Достоинствами электронной почты являются: легко воспринимаемые и запоминаемые человеком " +
                "адреса вида имя_пользователя@имя_домена (например, somebody@example.com cool.mail@habrahabr.ru!); " +
                "возможность передачи как простого текста, так и форматированного, а также произвольных файлов; " +
                "независимость серверов (в общем случае они обращаются друг к другу непосредственно); достаточно " +
                "высокая надёжность доставки сообщения; простота использования человеком и программами. Автор: mymail@g.ua. ";

        String [] arrtext = text.split(" ");
        System.out.println(Arrays.toString(arrtext));
        String [] arrtext1 = text.split(",");
        System.out.println(Arrays.toString(arrtext1));
        String [] arrtext2 = text.split(";");
        System.out.println(Arrays.toString(arrtext2));
        String [] arrtext3 = text.split(", ", 3);
        System.out.println(Arrays.toString(arrtext3));

        String arrtext4 = arrtext.toString();
        System.out.println(arrtext1);
    }
}
