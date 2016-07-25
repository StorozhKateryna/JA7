package HomeWork.date160721;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Игорь on 25.07.2016.
 */
public class Tar160721ex1 {
    public static void main(String[] args) {
        String str = "тел.:234-59-02, тел.моб.: +38 067 333 33 33";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String myPattern = "\\+{0,1}([0-9]{1,3}[ ]{0,1}[-]{0,1}[ ]{0,1}){3,5}";
        Pattern myRegEx = Pattern.compile(myPattern);
        Matcher m = myRegEx.matcher(str);
        while (m.find()){
            sb.append(m.group()+"\t");
            sb2.delete(sb2.indexOf(m.group()),sb2.indexOf(m.group())+m.group().length());
        }
        System.out.println("Исходная строка: \t" + str);
        System.out.println("Телефоны: \t" + sb.toString());
        System.out.println("Текст: \t" + sb2.toString());

    }
}
