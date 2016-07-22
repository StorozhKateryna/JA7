package HomeWork.date160715;

/**
 * Created by Игорь on 18.07.2016.
 */
public class TarEx4 {
    public static void main(String[] args) {
        String sb = new String("Цена: 0081 грн. Цена: 00511 грн. Цена: 054 грн. Цена: 998 грн.");
        System.out.println(sb);
        String str;
        StringBuilder str1 = new StringBuilder();
        int index = sb.indexOf("Цена:");
        while (index > -1 ) {
           str =  sb.substring(index + 6, sb.indexOf(" грн", index));
           str1.delete(0,str1.length());
            str1.append(str);
            str1 = str1.reverse();
            sb = sb.replace(str,str1.toString());
            index = sb.indexOf("Цена:", sb.indexOf(" грн", index));
        }
        System.out.println(sb);
    }
}
