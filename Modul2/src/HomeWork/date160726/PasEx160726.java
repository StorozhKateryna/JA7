import java.util.Arrays;

/**
 * Created by Acer552 on 26.07.2016.
 *//*1)Создать массив, на 10000 значений, числа от 0 до 1000, нужно отобрать из них те которые делятся
 * без остатка на 13.5 вывести их на печать и посчитать сумму.
*/
public class PasEx160726 {
    public static void main(String[] args) {

        int z =1000;
        double summ =0;
        double a[] = new double[z];
        for (double i1 = 13.5; i1 < a.length; i1 += 13.5) {
            double t =i1+13.5;
            //a[a.length]=i1;
            //summ+=z;
            System.out.println(i1+" - число яке діляться на 13,5 без залишку ");
            System.out.println(t);
        }

    }
}

