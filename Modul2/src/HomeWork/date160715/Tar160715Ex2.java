package HomeWork.date160715;

/**
 * Created by Игорь on 17.07.2016.
 */
public class Tar160715Ex2 {
    public static void main(String[] args) {
        String str = "Моя зарплата составляет 11010010111100 грн., но я хочу повышения на 1F4 $.";
        System.out.println(str);
        String zrpStr = str.substring(str.indexOf("составляет ") + 11,str.indexOf(" ",str.indexOf("составляет ") + 11));
        String zrpPlus = str.substring(str.indexOf("на ") + 3,str.indexOf(" ",str.indexOf("на ") + 3));
        int zrp = Integer.parseInt(zrpStr, 2);
        int plus = Integer.parseInt(zrpPlus, 16);
        int KURS = 25;
        System.out.println("Я хочу зарплату: " + (zrp + plus*KURS) + " грн.");

    }
}
