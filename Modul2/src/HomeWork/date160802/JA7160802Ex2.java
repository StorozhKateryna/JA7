package HomeWork.date160802;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Катерина on 03.08.2016.
 */

//2) Ввести с консоли дату. Сравнить ее с текущей датой в системе.
// Вывести отличающиеся части (год, месяц) на экран.

public class JA7160802Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yy");
        Date scannerDate;
        try {
            scannerDate = sdf.parse(d);
            System.out.println(scannerDate);

            Date currentDate = new Date();

            GregorianCalendar gr = new GregorianCalendar();
            gr.setTime(currentDate);
            GregorianCalendar gr1 = new GregorianCalendar();
            gr1.setTime(scannerDate);

            if (gr.compareTo(gr1) == 0) {
                System.out.println("Dates're equals");
            } else {
                SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
                String month = sdf1.format(gr.getTime());
                String month1 = sdf1.format(gr1.getTime());


                System.out.println(month + " Current Date");
                System.out.println(month1 + " Scanner Date");
                System.out.println(gr.get(Calendar.YEAR));
                System.out.println(gr1.get(Calendar.YEAR));

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
