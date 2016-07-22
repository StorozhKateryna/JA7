package HomeWork.date160715;

/**
 * Created by Игорь on 18.07.2016.
 */
public class TarEx3 {
    public static void main(String[] args) {
        String str = "Кто тО наПИсАл, а мНе ИспраВЛЯть !";
        String str1 = str.toLowerCase();
        str1 = str1.replace("кто", "Кто");
        str1 = str1.replace("мне", "Мне");
        System.out.println(str);
        System.out.println(str1);
    }
}
