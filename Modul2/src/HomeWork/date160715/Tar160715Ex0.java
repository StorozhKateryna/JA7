package HomeWork.date160715;
import java.util.Scanner;
/**
 * Created by Игорь on 17.07.2016.
 */
public class Tar160715Ex0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Тут нужно ввести (cntrl+c)фразу \"Я сейчас изучаю StringBuilder !\"\n:");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println("Ваша фpаза:");
        System.out.println(sb);
        sb.insert(sb.indexOf("String"),"методы ");
        System.out.println(sb);
        sb.deleteCharAt(sb.indexOf("!"));
        System.out.println(sb);
        System.out.println("Длинна фразы: " + sb.length());
    }
}
