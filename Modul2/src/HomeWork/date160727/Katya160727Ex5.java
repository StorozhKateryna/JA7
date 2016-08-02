package HomeWork.date160727;

/**
 * Написать метод который будет вычслять и выводить на экран косинусы углов в 60, 45 и 40.
 */
public class Katya160727Ex5 {
    public static void main(String[] args) {
        double a, b,c;
        a = 60;
        b = 45;
        c = 40;
        System.out.println(Math.cos(intoRadian(a)));
        System.out.println(Math.cos(intoRadian(b)));
        System.out.println(Math.cos(intoRadian(c)));

    }

    private static double intoRadian(double a) {
        return a * Math.PI/180;
    }



}

