package HomeWork.date160802;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Катерина on 03.08.2016.
 */
public class JA7160802Ex1v2 {
    public static void main(String[] args) {
        GregorianCalendar vladBirtsday = new GregorianCalendar(2010, Calendar.DECEMBER, 31);
        Date day = vladBirtsday.getTime();
        System.out.println(day);
        GregorianCalendar annaBirtsday = new GregorianCalendar(2010, Calendar.JUNE, 02);
        Date day1 = annaBirtsday.getTime();
        System.out.println(day1);
        int d = Math.abs(vladBirtsday.get(Calendar.DAY_OF_YEAR) - annaBirtsday.get(Calendar.DAY_OF_YEAR));
        System.out.println(d);
    }
}
