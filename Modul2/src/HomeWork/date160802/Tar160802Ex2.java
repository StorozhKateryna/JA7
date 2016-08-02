package HomeWork.date160802;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Игорь on 03.08.2016.
 */
public class Tar160802Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть місяць коли народилися 1-12");
        int month = sc.nextInt()-1;
        System.out.println("Введіть число коли народилися 1-12");
        int day = sc.nextInt();
        Calendar c1 = Calendar.getInstance();
        GregorianCalendar gc1 = new GregorianCalendar(c1.get(Calendar.YEAR),month,day);
        if(c1.get(Calendar.DAY_OF_YEAR)>=gc1.get(Calendar.DAY_OF_YEAR)){
        System.out.println("З дати вашого народження пройшло: " +(c1.get(Calendar.DAY_OF_YEAR)-gc1.get(Calendar.DAY_OF_YEAR))+" діб");
        }
        else {
            gc1 = new GregorianCalendar((c1.get(Calendar.YEAR)-1),month,day);
            int days = (int)((c1.getTimeInMillis()- gc1.getTimeInMillis())/1000/60/60/24);
            System.out.println("З дати вашого народження пройшло: " +days+" діб");
        }
        System.out.println("Ваш минулий день народження був: "+gc1.getTime());

    }
}
