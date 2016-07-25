package HomeWork.date160721;

/**
 * Created by Игорь on 25.07.2016.
 */
        import java.util.Arrays;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

/**
 * Задача 2:
 Дан текст: «Достоинствами электронной почты являются: легко воспринимаемые и запоминаемые
 человеком адреса вида имя_пользователя@имя_домена (например, somebody@example.com,
 cool.mail@habrahabr.ru!); возможность передачи как простого текста, так и форматированного, а также
 произвольных файлов; независимость серверов (в общем случае они обращаются друг к другу
 непосредственно); достаточно высокая надёжность доставки сообщения; простота использования
 человеком и
 программами. Автор: mymail@g.ua. »
 Используя split создать массив String-ов и после ряда проверок (какие они будут решать вам) нужно
 получить
 на выходе массив в котором хранятся почтовые адреса
 */

public class Tar160721ex2 {
    public static void main(String[] args) {
        String str = "Достоинствами электронной почты являются: легко воспринимаемые и запоминаемые\n" +
                " человеком адреса вида имя_пользователя@имя_домена (например, somebody@example.com,\n" +
                " cool.mail@habrahabr.ru!); возможность передачи как простого текста, так и форматированного, а также\n" +
                " произвольных файлов; независимость серверов (в общем случае они обращаются друг к другу\n" +
                " непосредственно); достаточно высокая надёжность доставки сообщения; простота использования\n" +
                " человеком и\n" +
                " программами. Автор: mymail@g.ua. ";
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0 ; i--) {
            strArr[i].replace(" ","");
            if(strArr[i].indexOf("@")==-1) strArr[i] = "";
            if(strArr[i].compareToIgnoreCase("zzzzzzz")>0) strArr[i]="";
            if(strArr[i].length()>1) {
                sb.delete(0,sb.length());
                sb.append(strArr[i]);
                for (int j = 1; j <strArr[i].length() ; j++) {
                    if (!Character.isLetterOrDigit(sb.charAt(sb.length()-1))) {
                        sb.deleteCharAt(sb.length()-1);
                    }
                    else break;
                }
                strArr[i] = sb.toString();
            }
        }
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }
}
