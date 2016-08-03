package HomeWork.date160802;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JA7160802Ex1 {
    public static void main(String[] args) {
        GregorianCalendar yanpasBirtsday = new GregorianCalendar(1987, Calendar.DECEMBER,29);
        GregorianCalendar oleksBirtsday = new GregorianCalendar(2005, Calendar.MARCH,30);
        long q = yanpasBirtsday.getTimeInMillis();
        long q1 = oleksBirtsday.getTimeInMillis();
        long q2 =Math.abs(q-q1) ;
        int w = (int) (q2/1000/60/60/24);
        System.out.println(w);
    }
}
